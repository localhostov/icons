package me.localx.icons.straight.outline

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

public val Icons.Outline.MoveToFolder2: ImageVector
    get() {
        if (_moveToFolder2 != null) {
            return _moveToFolder2!!
        }
        _moveToFolder2 = Builder(name = "MoveToFolder2", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(12.24f, 3.0f)
                lineTo(8.24f, 1.0f)
                lineTo(3.0f, 1.0f)
                curveTo(1.35f, 1.0f, 0.0f, 2.35f, 0.0f, 4.0f)
                lineTo(0.0f, 23.0f)
                lineTo(11.0f, 23.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 21.0f)
                lineTo(2.0f, 9.0f)
                lineTo(22.0f, 9.0f)
                verticalLineToRelative(4.35f)
                lineToRelative(2.0f, 2.0f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(7.76f, 3.0f)
                lineToRelative(4.0f, 2.0f)
                horizontalLineToRelative(9.24f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(23.42f, 17.59f)
                curveToRelative(0.77f, 0.78f, 0.77f, 2.04f, 0.0f, 2.81f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.01f)
                lineToRelative(-2.3f, -2.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.3f, 3.3f)
                close()
            }
        }
        .build()
        return _moveToFolder2!!
    }

private var _moveToFolder2: ImageVector? = null
