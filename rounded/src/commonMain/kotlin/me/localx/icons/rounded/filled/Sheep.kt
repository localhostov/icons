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

public val Icons.Filled.Sheep: ImageVector
    get() {
        if (_sheep != null) {
            return _sheep!!
        }
        _sheep = Builder(name = "Sheep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.89f, 3.869f)
                curveToRelative(-0.381f, 0.611f, -1.144f, 1.122f, -1.89f, 1.336f)
                verticalLineToRelative(4.478f)
                curveToRelative(0.0f, 2.046f, -1.533f, 3.316f, -4.0f, 3.316f)
                reflectiveCurveToRelative(-4.0f, -1.271f, -4.0f, -3.316f)
                verticalLineToRelative(-4.522f)
                curveToRelative(-0.782f, -0.203f, -1.494f, -0.656f, -1.89f, -1.293f)
                curveToRelative(-0.258f, -0.414f, -0.044f, -0.96f, 0.431f, -1.072f)
                curveToRelative(0.57f, -0.135f, 1.47f, -0.315f, 2.511f, -0.47f)
                curveToRelative(0.732f, -0.807f, 1.775f, -1.327f, 2.948f, -1.327f)
                reflectiveCurveToRelative(2.216f, 0.52f, 2.948f, 1.327f)
                curveToRelative(1.041f, 0.155f, 1.941f, 0.335f, 2.511f, 0.47f)
                curveToRelative(0.475f, 0.113f, 0.689f, 0.658f, 0.431f, 1.072f)
                close()
                moveTo(18.0f, 15.0f)
                curveToRelative(-3.589f, 0.0f, -6.0f, -2.137f, -6.0f, -5.316f)
                verticalLineToRelative(-2.684f)
                lineToRelative(-0.375f, -0.329f)
                curveToRelative(-0.62f, -0.434f, -1.357f, -0.671f, -2.125f, -0.671f)
                curveToRelative(-1.023f, 0.0f, -1.996f, 0.429f, -2.694f, 1.158f)
                curveToRelative(-0.345f, -0.104f, -0.701f, -0.158f, -1.056f, -0.158f)
                curveToRelative(-2.048f, 0.0f, -3.719f, 1.651f, -3.75f, 3.692f)
                curveToRelative(-1.21f, 0.637f, -2.0f, 1.898f, -2.0f, 3.308f)
                reflectiveCurveToRelative(0.791f, 2.672f, 2.0f, 3.308f)
                curveToRelative(0.027f, 1.785f, 1.308f, 3.272f, 3.0f, 3.617f)
                verticalLineToRelative(1.076f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-0.052f)
                curveToRelative(0.166f, 0.023f, 0.33f, 0.052f, 0.5f, 0.052f)
                curveToRelative(0.768f, 0.0f, 1.505f, -0.237f, 2.125f, -0.671f)
                curveToRelative(0.62f, 0.434f, 1.357f, 0.671f, 2.125f, 0.671f)
                curveToRelative(0.433f, 0.0f, 0.852f, -0.092f, 1.25f, -0.236f)
                verticalLineToRelative(0.236f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-1.319f)
                curveToRelative(1.305f, -0.573f, 2.227f, -1.864f, 2.25f, -3.373f)
                curveToRelative(1.21f, -0.636f, 2.0f, -1.897f, 2.0f, -3.308f)
                curveToRelative(0.0f, -0.425f, -0.088f, -0.83f, -0.223f, -1.215f)
                curveToRelative(-1.025f, 1.388f, -2.797f, 2.215f, -5.027f, 2.215f)
                close()
            }
        }
        .build()
        return _sheep!!
    }

private var _sheep: ImageVector? = null
