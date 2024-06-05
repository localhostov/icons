package me.localx.icons.rounded.outline

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

public val Icons.Outline.FlaskPotion: ImageVector
    get() {
        if (_flaskPotion != null) {
            return _flaskPotion!!
        }
        _flaskPotion = Builder(name = "FlaskPotion", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.549f, 6.595f)
                curveToRelative(-0.339f, -0.172f, -0.549f, -0.512f, -0.549f, -0.885f)
                verticalLineToRelative(-3.71f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(6.0f, 0.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.665f)
                curveToRelative(0.0f, 0.376f, -0.222f, 0.698f, -0.555f, 0.887f)
                curveTo(-0.5f, 10.5f, -0.001f, 16.503f, 0.001f, 16.554f)
                curveToRelative(0.0f, 0.053f, 0.128f, 2.11f, 0.385f, 3.048f)
                curveToRelative(0.709f, 2.59f, 3.089f, 4.398f, 5.79f, 4.398f)
                horizontalLineToRelative(11.646f)
                curveToRelative(2.701f, 0.0f, 5.081f, -1.809f, 5.79f, -4.398f)
                curveToRelative(0.257f, -0.938f, 0.387f, -1.909f, 0.387f, -2.888f)
                curveToRelative(0.0f, -4.221f, -2.472f, -8.099f, -6.451f, -10.119f)
                close()
                moveTo(7.34f, 8.341f)
                curveToRelative(1.024f, -0.513f, 1.66f, -1.538f, 1.66f, -2.676f)
                verticalLineToRelative(-3.665f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.71f)
                curveToRelative(0.0f, 1.13f, 0.629f, 2.152f, 1.643f, 2.668f)
                curveToRelative(2.26f, 1.147f, 3.934f, 3.004f, 4.767f, 5.17f)
                curveToRelative(-0.894f, 0.503f, -2.853f, 1.452f, -4.909f, 1.452f)
                curveToRelative(-1.652f, 0.0f, -2.865f, -0.455f, -4.148f, -0.937f)
                curveToRelative(-1.395f, -0.523f, -2.837f, -1.063f, -4.852f, -1.063f)
                curveToRelative(-1.921f, 0.0f, -3.866f, 0.809f, -5.234f, 1.542f)
                curveToRelative(0.653f, -2.629f, 2.475f, -4.901f, 5.074f, -6.201f)
                close()
                moveTo(21.684f, 19.074f)
                curveToRelative(-0.471f, 1.723f, -2.059f, 2.926f, -3.86f, 2.926f)
                lineTo(6.177f, 22.0f)
                curveToRelative(-1.802f, 0.0f, -3.39f, -1.203f, -3.86f, -2.926f)
                curveToRelative(-0.183f, -0.667f, -0.287f, -1.356f, -0.311f, -2.051f)
                curveToRelative(0.936f, -0.614f, 3.32f, -2.023f, 5.495f, -2.023f)
                curveToRelative(1.652f, 0.0f, 2.865f, 0.455f, 4.148f, 0.937f)
                curveToRelative(1.395f, 0.523f, 2.837f, 1.063f, 4.852f, 1.063f)
                curveToRelative(2.196f, 0.0f, 4.223f, -0.836f, 5.421f, -1.454f)
                curveToRelative(0.052f, 0.385f, 0.079f, 0.775f, 0.079f, 1.168f)
                curveToRelative(0.0f, 0.8f, -0.106f, 1.594f, -0.316f, 2.36f)
                close()
            }
        }
        .build()
        return _flaskPotion!!
    }

private var _flaskPotion: ImageVector? = null
