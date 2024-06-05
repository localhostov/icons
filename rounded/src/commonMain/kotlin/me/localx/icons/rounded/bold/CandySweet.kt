package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.CandySweet: ImageVector
    get() {
        if (_candySweet != null) {
            return _candySweet!!
        }
        _candySweet = Builder(name = "CandySweet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.88f, 9.933f)
                curveToRelative(-0.105f, -0.88f, -1.138f, -1.293f, -1.815f, -0.721f)
                lineToRelative(-1.238f, 1.045f)
                curveToRelative(-0.814f, -4.131f, -4.461f, -7.258f, -8.827f, -7.258f)
                reflectiveCurveTo(3.987f, 6.126f, 3.173f, 10.257f)
                lineToRelative(-1.237f, -1.044f)
                curveToRelative(-0.677f, -0.572f, -1.71f, -0.158f, -1.815f, 0.721f)
                curveTo(0.052f, 10.511f, 0.001f, 11.205f, 0.001f, 12.0f)
                reflectiveCurveToRelative(0.05f, 1.489f, 0.119f, 2.066f)
                curveToRelative(0.105f, 0.88f, 1.138f, 1.293f, 1.815f, 0.722f)
                lineToRelative(1.237f, -1.045f)
                curveToRelative(0.814f, 4.131f, 4.461f, 7.257f, 8.827f, 7.257f)
                reflectiveCurveToRelative(8.013f, -3.126f, 8.827f, -7.258f)
                lineToRelative(1.238f, 1.045f)
                curveToRelative(0.677f, 0.572f, 1.71f, 0.159f, 1.815f, -0.721f)
                curveToRelative(0.069f, -0.577f, 0.12f, -1.271f, 0.12f, -2.067f)
                reflectiveCurveToRelative(-0.051f, -1.49f, -0.12f, -2.067f)
                close()
                moveTo(11.872f, 6.006f)
                lineToRelative(-5.866f, 5.866f)
                curveToRelative(0.068f, -3.206f, 2.659f, -5.798f, 5.866f, -5.866f)
                close()
                moveTo(6.928f, 15.192f)
                lineTo(15.192f, 6.929f)
                curveToRelative(0.758f, 0.479f, 1.4f, 1.121f, 1.879f, 1.879f)
                lineToRelative(-8.264f, 8.264f)
                curveToRelative(-0.758f, -0.479f, -1.4f, -1.121f, -1.879f, -1.879f)
                close()
                moveTo(12.127f, 17.993f)
                lineToRelative(5.866f, -5.866f)
                curveToRelative(-0.068f, 3.206f, -2.659f, 5.798f, -5.866f, 5.866f)
                close()
            }
        }
        .build()
        return _candySweet!!
    }

private var _candySweet: ImageVector? = null
