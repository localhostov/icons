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

public val Icons.Filled.CrateEmpty: ImageVector
    get() {
        if (_crateEmpty != null) {
            return _crateEmpty!!
        }
        _crateEmpty = Builder(name = "CrateEmpty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 21.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _crateEmpty!!
    }

private var _crateEmpty: ImageVector? = null
