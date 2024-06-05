package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.BoxUp: ImageVector
    get() {
        if (_boxUp != null) {
            return _boxUp!!
        }
        _boxUp = Builder(name = "BoxUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(20.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.041f, 13.113f)
                lineToRelative(-2.041f, -2.041f)
                verticalLineToRelative(5.928f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.928f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(5.928f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.928f)
                lineToRelative(-2.092f, 2.092f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.215f, -3.215f)
                curveToRelative(0.712f, -0.712f, 1.871f, -0.712f, 2.583f, 0.0f)
                lineToRelative(1.708f, 1.708f)
                lineToRelative(1.708f, -1.708f)
                curveToRelative(0.712f, -0.712f, 1.871f, -0.712f, 2.583f, 0.0f)
                lineToRelative(3.164f, 3.164f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _boxUp!!
    }

private var _boxUp: ImageVector? = null
