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

public val Icons.Filled.Blueprint: ImageVector
    get() {
        if (_blueprint != null) {
            return _blueprint!!
        }
        _blueprint = Builder(name = "Blueprint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 17.762f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.925f, 0.0f, -1.784f, 0.282f, -2.5f, 0.762f)
                close()
                moveTo(24.0f, 4.0f)
                verticalLineToRelative(20.0f)
                lineTo(2.5f, 24.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.5f)
                lineTo(7.0f, 4.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(21.0f, 8.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-11.0f)
                close()
            }
        }
        .build()
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
