package me.localx.icons.rounded.filled

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

public val Icons.Filled.CandyBar: ImageVector
    get() {
        if (_candyBar != null) {
            return _candyBar!!
        }
        _candyBar = Builder(name = "CandyBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.162f, 9.183f)
                lineToRelative(5.032f, -5.032f)
                reflectiveCurveToRelative(-1.194f, 1.349f, -1.194f, 2.849f)
                curveToRelative(0.0f, 0.427f, 0.263f, 1.099f, 0.526f, 1.436f)
                curveToRelative(0.269f, 0.346f, 0.489f, 0.498f, 0.489f, 0.814f)
                reflectiveCurveToRelative(-0.382f, 0.558f, -0.621f, 0.924f)
                curveToRelative(-0.261f, 0.399f, -0.393f, 0.898f, -0.393f, 1.326f)
                curveToRelative(0.0f, 1.5f, 1.14f, 2.661f, 1.14f, 2.661f)
                lineToRelative(-4.978f, -4.978f)
                close()
                moveTo(15.748f, 10.597f)
                lineToRelative(-3.273f, 3.273f)
                lineToRelative(5.005f, 5.005f)
                lineToRelative(3.273f, -3.273f)
                lineToRelative(-5.005f, -5.005f)
                close()
                moveTo(4.711f, 8.934f)
                lineToRelative(-2.151f, 2.151f)
                curveToRelative(-1.006f, 1.005f, -1.56f, 2.343f, -1.56f, 3.766f)
                reflectiveCurveToRelative(0.554f, 2.76f, 1.56f, 3.766f)
                lineToRelative(3.824f, 3.823f)
                curveToRelative(1.005f, 1.006f, 2.343f, 1.56f, 3.766f, 1.56f)
                reflectiveCurveToRelative(2.76f, -0.554f, 3.766f, -1.56f)
                lineToRelative(2.151f, -2.151f)
                lineTo(4.711f, 8.934f)
                close()
                moveTo(11.061f, 12.456f)
                lineToRelative(3.273f, -3.273f)
                lineToRelative(-4.936f, -4.936f)
                lineToRelative(-3.273f, 3.273f)
                lineToRelative(4.936f, 4.936f)
                close()
                moveTo(15.748f, 7.769f)
                lineToRelative(5.039f, -5.038f)
                lineToRelative(-1.17f, -1.17f)
                curveToRelative(-1.005f, -1.006f, -2.343f, -1.56f, -3.766f, -1.56f)
                reflectiveCurveToRelative(-2.76f, 0.554f, -3.766f, 1.56f)
                lineToRelative(-1.273f, 1.273f)
                lineToRelative(4.936f, 4.936f)
                close()
            }
        }
        .build()
        return _candyBar!!
    }

private var _candyBar: ImageVector? = null
