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

public val Icons.Filled.Cross: ImageVector
    get() {
        if (_cross != null) {
            return _cross!!
        }
        _cross = Builder(name = "Cross", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 511.991f, viewportHeight = 511.991f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(286.161f, 255.867f)
                lineTo(505.745f, 36.283f)
                curveToRelative(8.185f, -8.474f, 7.951f, -21.98f, -0.523f, -30.165f)
                curveToRelative(-8.267f, -7.985f, -21.375f, -7.985f, -29.642f, 0.0f)
                lineTo(255.995f, 225.702f)
                lineTo(36.411f, 6.118f)
                curveToRelative(-8.475f, -8.185f, -21.98f, -7.95f, -30.165f, 0.524f)
                curveToRelative(-7.985f, 8.267f, -7.985f, 21.374f, 0.0f, 29.641f)
                lineTo(225.83f, 255.867f)
                lineTo(6.246f, 475.451f)
                curveToRelative(-8.328f, 8.331f, -8.328f, 21.835f, 0.0f, 30.165f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(8.331f, 8.328f, 21.835f, 8.328f, 30.165f, 0.0f)
                lineToRelative(219.584f, -219.584f)
                lineToRelative(219.584f, 219.584f)
                curveToRelative(8.331f, 8.328f, 21.835f, 8.328f, 30.165f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(8.328f, -8.331f, 8.328f, -21.835f, 0.0f, -30.165f)
                lineTo(286.161f, 255.867f)
                close()
            }
        }
        .build()
        return _cross!!
    }

private var _cross: ImageVector? = null
