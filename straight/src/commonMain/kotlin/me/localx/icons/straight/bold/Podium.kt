package me.localx.icons.straight.bold

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

public val Icons.Bold.Podium: ImageVector
    get() {
        if (_podium != null) {
            return _podium!!
        }
        _podium = Builder(name = "Podium", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.456f, 0.607f, 1.182f, 1.0f, 2.0f, 1.0f)
                horizontalLineToRelative(4.25f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.25f)
                curveToRelative(-0.818f, 0.0f, -1.544f, 0.393f, -2.0f, 1.0f)
                horizontalLineToRelative(-0.75f)
                curveTo(4.467f, 1.0f, 2.0f, 3.467f, 2.0f, 6.5f)
                verticalLineToRelative(3.5f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.248f, 13.0f)
                lineToRelative(2.0f, 11.0f)
                lineTo(20.31f, 24.0f)
                lineToRelative(1.5f, -11.0f)
                horizontalLineToRelative(2.191f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.69f, 21.0f)
                lineTo(6.752f, 21.0f)
                lineToRelative(-1.455f, -8.0f)
                horizontalLineToRelative(13.484f)
                lineToRelative(-1.091f, 8.0f)
                close()
            }
        }
        .build()
        return _podium!!
    }

private var _podium: ImageVector? = null
