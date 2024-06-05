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

public val Icons.Outline.Tags: ImageVector
    get() {
        if (_tags != null) {
            return _tags!!
        }
        _tags = Builder(name = "Tags", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.707f, 9.256f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.024f, 0.0f, 1.414f)
                curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.024f, 0.0f, -1.414f)
                curveToRelative(0.391f, -0.391f, 1.024f, -0.391f, 1.414f, 0.0f)
                close()
                moveTo(21.559f, 15.341f)
                lineToRelative(-0.565f, 0.565f)
                curveToRelative(-0.027f, 1.233f, -0.505f, 2.457f, -1.435f, 3.399f)
                lineToRelative(-3.167f, 3.208f)
                curveToRelative(-0.943f, 0.955f, -2.201f, 1.483f, -3.543f, 1.487f)
                horizontalLineToRelative(-0.017f)
                curveToRelative(-1.335f, 0.0f, -2.59f, -0.52f, -3.534f, -1.464f)
                lineTo(1.882f, 15.183f)
                curveToRelative(-0.65f, -0.649f, -0.964f, -1.542f, -0.864f, -2.453f)
                lineToRelative(0.765f, -6.916f)
                curveToRelative(0.051f, -0.456f, 0.404f, -0.819f, 0.858f, -0.881f)
                lineToRelative(6.889f, -0.942f)
                curveToRelative(0.932f, -0.124f, 1.87f, 0.193f, 2.528f, 0.851f)
                lineToRelative(7.475f, 7.412f)
                curveToRelative(0.387f, 0.387f, 0.697f, 0.823f, 0.931f, 1.288f)
                curveToRelative(0.812f, -1.166f, 0.698f, -2.795f, -0.342f, -3.835f)
                lineTo(12.531f, 2.302f)
                curveToRelative(-0.229f, -0.229f, -0.545f, -0.335f, -0.851f, -0.292f)
                lineToRelative(-6.889f, 0.942f)
                curveToRelative(-0.549f, 0.074f, -1.052f, -0.309f, -1.127f, -0.855f)
                curveToRelative(-0.074f, -0.547f, 0.309f, -1.051f, 0.855f, -1.126f)
                lineTo(11.409f, 0.028f)
                curveToRelative(0.921f, -0.131f, 1.869f, 0.191f, 2.528f, 0.852f)
                lineToRelative(7.589f, 7.405f)
                curveToRelative(1.946f, 1.945f, 1.957f, 5.107f, 0.032f, 7.057f)
                close()
                moveTo(18.121f, 13.671f)
                lineToRelative(-7.475f, -7.412f)
                curveToRelative(-0.223f, -0.223f, -0.536f, -0.326f, -0.847f, -0.287f)
                lineToRelative(-6.115f, 0.837f)
                lineToRelative(-0.679f, 6.14f)
                curveToRelative(-0.033f, 0.303f, 0.071f, 0.601f, 0.287f, 0.816f)
                lineToRelative(7.416f, 7.353f)
                curveToRelative(0.569f, 0.57f, 1.322f, 0.881f, 2.123f, 0.881f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.806f, -0.002f, 1.561f, -0.319f, 2.126f, -0.893f)
                lineToRelative(3.167f, -3.208f)
                curveToRelative(1.155f, -1.17f, 1.149f, -3.067f, -0.014f, -4.229f)
                close()
            }
        }
        .build()
        return _tags!!
    }

private var _tags: ImageVector? = null
