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

public val Icons.Bold.GreaterThanEqual: ImageVector
    get() {
        if (_greaterThanEqual != null) {
            return _greaterThanEqual!!
        }
        _greaterThanEqual = Builder(name = "GreaterThanEqual", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.98f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(4.48f, 24.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(17.573f, 10.229f)
                lineToRelative(-13.687f, 5.894f)
                curveToRelative(-0.761f, 0.328f, -1.111f, 1.21f, -0.784f, 1.972f)
                curveToRelative(0.245f, 0.567f, 0.798f, 0.906f, 1.379f, 0.906f)
                curveToRelative(0.197f, 0.0f, 0.399f, -0.039f, 0.593f, -0.122f)
                lineToRelative(13.686f, -5.894f)
                curveToRelative(1.382f, -0.595f, 2.24f, -1.93f, 2.24f, -3.484f)
                reflectiveCurveToRelative(-0.858f, -2.889f, -2.239f, -3.483f)
                lineTo(5.074f, 0.123f)
                curveToRelative(-0.763f, -0.33f, -1.644f, 0.024f, -1.972f, 0.784f)
                curveToRelative(-0.327f, 0.761f, 0.023f, 1.643f, 0.784f, 1.971f)
                lineToRelative(13.688f, 5.895f)
                curveToRelative(0.396f, 0.17f, 0.426f, 0.6f, 0.426f, 0.728f)
                reflectiveCurveToRelative(-0.03f, 0.558f, -0.427f, 0.729f)
                close()
            }
        }
        .build()
        return _greaterThanEqual!!
    }

private var _greaterThanEqual: ImageVector? = null
