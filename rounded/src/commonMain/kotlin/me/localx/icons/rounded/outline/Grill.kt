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

public val Icons.Outline.Grill: ImageVector
    get() {
        if (_grill != null) {
            return _grill!!
        }
        _grill = Builder(name = "Grill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.339f, 7.129f)
                arcTo(2.978f, 2.978f, 0.0f, false, false, 21.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-6.654f, 1.04f, -0.636f, 9.791f, 2.833f, 11.341f)
                lineTo(4.053f, 22.684f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.9f, 0.632f)
                lineTo(7.654f, 18.2f)
                arcTo(12.329f, 12.329f, 0.0f, false, false, 11.0f, 18.957f)
                lineTo(11.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(13.0f, 18.957f)
                arcToRelative(12.322f, 12.322f, 0.0f, false, false, 3.345f, -0.758f)
                lineToRelative(1.706f, 5.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.9f, -0.632f)
                lineToRelative(-1.781f, -5.345f)
                curveTo(21.009f, 15.85f, 25.622f, 10.4f, 23.339f, 7.129f)
                close()
                moveTo(21.972f, 9.244f)
                curveTo(19.488f, 19.5f, 4.506f, 19.5f, 2.026f, 9.244f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 3.0f, 8.0f)
                lineTo(21.0f, 8.0f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 21.972f, 9.244f)
                close()
                moveTo(11.0f, 3.0f)
                lineTo(11.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(13.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 3.0f)
                close()
                moveTo(15.0f, 3.0f)
                lineTo(15.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                lineTo(17.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 3.0f)
                close()
                moveTo(7.0f, 3.0f)
                lineTo(7.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 9.0f, 1.0f)
                lineTo(9.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 3.0f)
                close()
            }
        }
        .build()
        return _grill!!
    }

private var _grill: ImageVector? = null
