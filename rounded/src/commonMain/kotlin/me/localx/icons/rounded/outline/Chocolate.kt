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

public val Icons.Outline.Chocolate: ImageVector
    get() {
        if (_chocolate != null) {
            return _chocolate!!
        }
        _chocolate = Builder(name = "Chocolate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.547f, 5.666f)
                lineTo(18.355f, 1.474f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, false, -7.065f, 0.0f)
                lineTo(1.473f, 11.291f)
                arcToRelative(5.019f, 5.019f, 0.0f, false, false, 0.0f, 7.064f)
                lineToRelative(4.192f, 4.192f)
                arcToRelative(5.019f, 5.019f, 0.0f, false, false, 7.065f, 0.0f)
                lineToRelative(9.817f, -9.817f)
                arcTo(5.018f, 5.018f, 0.0f, false, false, 22.547f, 5.666f)
                close()
                moveTo(14.823f, 2.009f)
                curveToRelative(1.433f, -0.115f, 2.557f, 1.33f, 3.467f, 2.225f)
                lineTo(15.747f, 6.776f)
                lineTo(12.28f, 3.309f)
                arcTo(3.334f, 3.334f, 0.0f, false, true, 14.823f, 2.009f)
                close()
                moveTo(16.932f, 15.519f)
                lineTo(13.381f, 11.968f)
                lineTo(15.747f, 9.6f)
                lineTo(19.3f, 13.153f)
                close()
                moveTo(13.179f, 19.272f)
                lineTo(9.628f, 15.721f)
                lineToRelative(2.34f, -2.34f)
                lineToRelative(3.551f, 3.551f)
                close()
                moveTo(7.088f, 8.5f)
                lineToRelative(3.467f, 3.467f)
                lineToRelative(-2.34f, 2.34f)
                lineTo(4.748f, 10.842f)
                close()
                moveTo(11.968f, 10.554f)
                lineTo(8.5f, 7.088f)
                lineToRelative(2.366f, -2.366f)
                lineToRelative(3.467f, 3.467f)
                close()
                moveTo(2.009f, 14.823f)
                arcToRelative(3.368f, 3.368f, 0.0f, false, true, 1.326f, -2.568f)
                lineTo(6.8f, 15.721f)
                lineTo(4.233f, 18.289f)
                curveTo(3.335f, 17.376f, 1.9f, 16.26f, 2.009f, 14.823f)
                close()
                moveTo(7.078f, 21.134f)
                lineTo(5.646f, 19.7f)
                lineToRelative(2.569f, -2.568f)
                lineToRelative(3.551f, 3.551f)
                arcTo(3.163f, 3.163f, 0.0f, false, true, 7.078f, 21.134f)
                close()
                moveTo(21.134f, 11.317f)
                lineTo(20.711f, 11.74f)
                lineTo(17.16f, 8.189f)
                lineTo(19.7f, 5.647f)
                lineToRelative(1.432f, 1.431f)
                arcTo(3.011f, 3.011f, 0.0f, false, true, 21.134f, 11.317f)
                close()
            }
        }
        .build()
        return _chocolate!!
    }

private var _chocolate: ImageVector? = null
