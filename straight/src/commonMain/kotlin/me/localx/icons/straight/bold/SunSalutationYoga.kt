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

public val Icons.Bold.SunSalutationYoga: ImageVector
    get() {
        if (_sunSalutationYoga != null) {
            return _sunSalutationYoga!!
        }
        _sunSalutationYoga = Builder(name = "SunSalutationYoga", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(16.289f, 6.615f)
                lineToRelative(-1.281f, 1.754f)
                lineToRelative(-1.312f, -1.333f)
                curveToRelative(-0.693f, -0.653f, -1.661f, -1.013f, -2.612f, -1.029f)
                curveToRelative(-1.706f, 0.036f, -3.083f, 1.428f, -3.083f, 3.142f)
                verticalLineToRelative(4.852f)
                curveToRelative(0.0f, 1.41f, 0.673f, 2.755f, 1.8f, 3.6f)
                lineToRelative(0.2f, 0.15f)
                verticalLineToRelative(6.25f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-13.395f)
                lineToRelative(1.371f, 1.395f)
                horizontalLineToRelative(1.698f)
                lineToRelative(2.642f, -3.615f)
                lineToRelative(-2.422f, -1.771f)
                close()
            }
        }
        .build()
        return _sunSalutationYoga!!
    }

private var _sunSalutationYoga: ImageVector? = null
