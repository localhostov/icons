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

public val Icons.Bold.DraftingCompass: ImageVector
    get() {
        if (_draftingCompass != null) {
            return _draftingCompass!!
        }
        _draftingCompass = Builder(name = "DraftingCompass", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.935f, 22.408f)
                lineToRelative(-3.933f, -6.708f)
                curveToRelative(0.964f, -0.599f, 1.88f, -1.304f, 2.716f, -2.14f)
                lineToRelative(-2.121f, -2.121f)
                curveToRelative(-0.651f, 0.651f, -1.363f, 1.204f, -2.111f, 1.676f)
                lineToRelative(-3.022f, -5.153f)
                curveToRelative(0.331f, -0.582f, 0.536f, -1.246f, 0.536f, -1.963f)
                curveToRelative(0.0f, -1.675f, -1.036f, -3.107f, -2.5f, -3.703f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 2.297f)
                curveToRelative(-1.464f, 0.595f, -2.5f, 2.028f, -2.5f, 3.703f)
                curveToRelative(0.0f, 0.717f, 0.205f, 1.38f, 0.536f, 1.963f)
                lineToRelative(-3.022f, 5.153f)
                curveToRelative(-0.748f, -0.472f, -1.46f, -1.025f, -2.111f, -1.676f)
                lineToRelative(-2.121f, 2.121f)
                curveToRelative(0.836f, 0.836f, 1.753f, 1.54f, 2.716f, 2.14f)
                lineTo(0.065f, 22.408f)
                lineToRelative(2.588f, 1.518f)
                lineToRelative(4.046f, -6.9f)
                curveToRelative(1.707f, 0.635f, 3.502f, 0.966f, 5.301f, 0.966f)
                reflectiveCurveToRelative(3.594f, -0.332f, 5.301f, -0.966f)
                lineToRelative(4.046f, 6.9f)
                lineToRelative(2.588f, -1.518f)
                close()
                moveTo(10.5f, 6.0f)
                curveToRelative(0.0f, -0.827f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(8.244f, 14.391f)
                lineToRelative(2.673f, -4.559f)
                curveToRelative(0.347f, 0.098f, 0.705f, 0.168f, 1.083f, 0.168f)
                reflectiveCurveToRelative(0.736f, -0.069f, 1.083f, -0.168f)
                lineToRelative(2.673f, 4.559f)
                curveToRelative(-2.439f, 0.788f, -5.073f, 0.788f, -7.512f, 0.0f)
                close()
            }
        }
        .build()
        return _draftingCompass!!
    }

private var _draftingCompass: ImageVector? = null
