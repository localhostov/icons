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

public val Icons.Filled.Baby: ImageVector
    get() {
        if (_baby != null) {
            return _baby!!
        }
        _baby = Builder(name = "Baby", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.993f, 6.166f)
                curveToRelative(-0.05f, 0.587f, -0.353f, 1.119f, -0.815f, 1.45f)
                lineToRelative(-5.178f, 3.412f)
                verticalLineToRelative(4.247f)
                lineToRelative(2.414f, 2.329f)
                curveToRelative(0.54f, 0.54f, 0.725f, 1.324f, 0.483f, 2.047f)
                lineToRelative(-1.0f, 3.0f)
                curveToRelative(-0.273f, 0.818f, -1.035f, 1.368f, -1.897f, 1.368f)
                curveToRelative(-0.334f, 0.0f, -0.656f, -0.082f, -0.956f, -0.243f)
                curveToRelative(-0.84f, -0.455f, -1.227f, -1.537f, -0.901f, -2.516f)
                lineToRelative(0.57f, -1.709f)
                lineToRelative(-3.714f, -3.085f)
                lineToRelative(3.0f, -1.206f)
                verticalLineToRelative(-2.26f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.231f)
                lineToRelative(3.0f, 1.236f)
                lineToRelative(-3.714f, 3.085f)
                lineToRelative(0.569f, 1.709f)
                curveToRelative(0.327f, 0.979f, -0.06f, 2.06f, -0.898f, 2.514f)
                curveToRelative(-0.297f, 0.16f, -0.628f, 0.245f, -0.958f, 0.245f)
                curveToRelative(-0.862f, 0.0f, -1.624f, -0.55f, -1.897f, -1.368f)
                lineToRelative(-1.0f, -3.0f)
                curveToRelative(-0.241f, -0.723f, -0.056f, -1.507f, 0.483f, -2.047f)
                lineToRelative(2.414f, -2.378f)
                verticalLineToRelative(-4.198f)
                lineTo(1.854f, 7.637f)
                curveToRelative(-0.488f, -0.349f, -0.797f, -0.885f, -0.847f, -1.472f)
                curveToRelative(-0.049f, -0.586f, 0.164f, -1.164f, 0.584f, -1.587f)
                curveToRelative(0.677f, -0.683f, 1.821f, -0.743f, 2.678f, -0.133f)
                lineToRelative(4.573f, 2.982f)
                curveToRelative(0.524f, 0.373f, 1.133f, 0.57f, 1.761f, 0.57f)
                horizontalLineToRelative(2.793f)
                curveToRelative(0.628f, 0.0f, 1.231f, -0.193f, 1.726f, -0.547f)
                lineToRelative(4.643f, -3.029f)
                curveToRelative(0.831f, -0.593f, 1.967f, -0.524f, 2.644f, 0.156f)
                curveToRelative(0.42f, 0.423f, 0.633f, 1.001f, 0.584f, 1.587f)
                close()
                moveTo(16.0f, 4.02f)
                curveTo(16.0f, 1.813f, 14.206f, 0.019f, 12.0f, 0.019f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 2.136f, 1.687f, 3.87f, 3.795f, 3.979f)
                horizontalLineToRelative(0.409f)
                curveToRelative(2.109f, -0.109f, 3.795f, -1.843f, 3.795f, -3.979f)
                close()
            }
        }
        .build()
        return _baby!!
    }

private var _baby: ImageVector? = null
