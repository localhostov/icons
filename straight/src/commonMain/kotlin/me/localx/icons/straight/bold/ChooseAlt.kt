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

public val Icons.Bold.ChooseAlt: ImageVector
    get() {
        if (_chooseAlt != null) {
            return _chooseAlt!!
        }
        _chooseAlt = Builder(name = "ChooseAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.818f, -0.393f, 1.544f, -1.0f, 2.0f)
                verticalLineToRelative(3.837f)
                curveToRelative(-0.455f, -0.216f, -0.963f, -0.337f, -1.5f, -0.337f)
                reflectiveCurveToRelative(-1.045f, 0.121f, -1.5f, 0.337f)
                verticalLineToRelative(-3.837f)
                curveToRelative(-0.607f, -0.456f, -1.0f, -1.182f, -1.0f, -2.0f)
                close()
                moveTo(13.5f, 11.58f)
                curveToRelative(0.0f, -0.747f, -0.536f, -1.44f, -1.273f, -1.56f)
                curveToRelative(-0.94f, -0.153f, -1.739f, 0.568f, -1.739f, 1.479f)
                verticalLineToRelative(7.289f)
                lineToRelative(-1.205f, -0.815f)
                curveToRelative(-0.866f, -0.722f, -2.153f, -0.604f, -2.874f, 0.261f)
                curveToRelative(-0.722f, 0.866f, -0.605f, 2.153f, 0.261f, 2.874f)
                lineToRelative(3.831f, 2.891f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.88f)
                lineToRelative(5.5f, 1.942f)
                verticalLineToRelative(2.938f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.062f)
                lineToRelative(-8.5f, -2.999f)
                verticalLineToRelative(-4.359f)
                close()
                moveTo(14.034f, 8.651f)
                curveToRelative(0.837f, 0.599f, 1.399f, 1.558f, 1.46f, 2.65f)
                lineToRelative(3.281f, -2.409f)
                curveToRelative(0.229f, 0.069f, 0.473f, 0.107f, 0.725f, 0.107f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-1.372f, 0.0f, -2.485f, 1.105f, -2.499f, 2.474f)
                lineToRelative(-2.966f, 2.178f)
                close()
                moveTo(8.511f, 11.217f)
                curveToRelative(0.086f, -1.082f, 0.665f, -2.026f, 1.513f, -2.607f)
                lineToRelative(-3.025f, -2.167f)
                curveToRelative(-0.03f, -1.355f, -1.137f, -2.444f, -2.499f, -2.444f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.262f, 0.0f, 0.515f, -0.041f, 0.753f, -0.116f)
                lineToRelative(3.258f, 2.333f)
                close()
            }
        }
        .build()
        return _chooseAlt!!
    }

private var _chooseAlt: ImageVector? = null
