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

public val Icons.Filled.Croissant: ImageVector
    get() {
        if (_croissant != null) {
            return _croissant!!
        }
        _croissant = Builder(name = "Croissant", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.94f, 6.573f)
                arcToRelative(2.849f, 2.849f, 0.0f, false, true, -2.516f, 2.284f)
                reflectiveCurveToRelative(-1.051f, 0.165f, -1.51f, 0.284f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 20.0f, 8.146f)
                lineTo(20.0f, 4.011f)
                arcToRelative(6.052f, 6.052f, 0.0f, false, false, -0.217f, -1.578f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 2.795f, 1.138f)
                arcTo(2.765f, 2.765f, 0.0f, false, true, 23.94f, 6.573f)
                close()
                moveTo(14.147f, 14.129f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.6f, -3.308f)
                lineTo(10.991f, 3.607f)
                arcTo(4.351f, 4.351f, 0.0f, false, false, 4.16f, 2.06f)
                curveToRelative(-0.342f, 0.292f, -0.684f, 0.6f, -1.018f, 0.912f)
                curveToRelative(-0.355f, 0.334f, -0.717f, 0.712f, -1.077f, 1.124f)
                arcToRelative(4.323f, 4.323f, 0.0f, false, false, -0.957f, 3.826f)
                arcToRelative(4.453f, 4.453f, 0.0f, false, false, 2.539f, 3.1f)
                lineToRelative(7.2f, 3.717f)
                arcTo(2.9f, 2.9f, 0.0f, false, false, 12.059f, 15.0f)
                arcTo(2.936f, 2.936f, 0.0f, false, false, 14.147f, 14.129f)
                close()
                moveTo(16.473f, 0.862f)
                arcTo(3.966f, 3.966f, 0.0f, false, false, 13.082f, 0.109f)
                arcToRelative(16.852f, 16.852f, 0.0f, false, false, -1.814f, 0.543f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, 1.524f, 2.083f)
                lineToRelative(3.78f, 7.271f)
                arcToRelative(4.963f, 4.963f, 0.0f, false, true, 0.174f, 0.492f)
                lineToRelative(0.01f, -0.01f)
                arcTo(5.525f, 5.525f, 0.0f, false, false, 18.0f, 7.0f)
                lineTo(18.0f, 4.011f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 16.473f, 0.862f)
                close()
                moveTo(6.573f, 23.939f)
                arcToRelative(2.849f, 2.849f, 0.0f, false, false, 2.283f, -2.516f)
                reflectiveCurveToRelative(0.165f, -1.051f, 0.284f, -1.51f)
                arcTo(7.489f, 7.489f, 0.0f, false, true, 8.146f, 20.0f)
                lineTo(4.01f, 20.0f)
                arcToRelative(6.058f, 6.058f, 0.0f, false, true, -1.578f, -0.217f)
                arcToRelative(11.779f, 11.779f, 0.0f, false, false, 1.138f, 2.8f)
                arcTo(2.766f, 2.766f, 0.0f, false, false, 6.573f, 23.939f)
                close()
                moveTo(4.01f, 18.0f)
                lineTo(7.0f, 18.0f)
                arcToRelative(5.525f, 5.525f, 0.0f, false, false, 3.488f, -1.244f)
                lineToRelative(0.01f, -0.009f)
                arcToRelative(5.123f, 5.123f, 0.0f, false, true, -0.491f, -0.175f)
                lineToRelative(-7.271f, -3.78f)
                arcTo(6.4f, 6.4f, 0.0f, false, true, 0.651f, 11.267f)
                arcToRelative(16.622f, 16.622f, 0.0f, false, false, -0.542f, 1.814f)
                arcToRelative(3.959f, 3.959f, 0.0f, false, false, 0.753f, 3.391f)
                arcTo(3.991f, 3.991f, 0.0f, false, false, 4.01f, 18.0f)
                close()
            }
        }
        .build()
        return _croissant!!
    }

private var _croissant: ImageVector? = null
