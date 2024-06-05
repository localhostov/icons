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

public val Icons.Filled.Scalpel: ImageVector
    get() {
        if (_scalpel != null) {
            return _scalpel!!
        }
        _scalpel = Builder(name = "Scalpel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.797f)
                curveToRelative(0.0f, 0.747f, -0.291f, 1.449f, -0.819f, 1.978f)
                lineToRelative(-9.048f, 9.034f)
                lineToRelative(-4.03f, -3.957f)
                lineTo(19.23f, 1.815f)
                curveToRelative(1.049f, -1.049f, 2.896f, -1.052f, 3.951f, 0.004f)
                curveToRelative(0.527f, 0.527f, 0.818f, 1.229f, 0.818f, 1.978f)
                close()
                moveTo(8.682f, 12.259f)
                lineTo(0.302f, 20.557f)
                curveToRelative(-0.152f, 0.151f, -0.252f, 0.347f, -0.285f, 0.558f)
                curveToRelative(-0.055f, 0.355f, 0.014f, 0.885f, 0.371f, 1.302f)
                curveToRelative(0.233f, 0.271f, 0.673f, 0.596f, 1.446f, 0.596f)
                curveToRelative(0.421f, 0.0f, 0.792f, 0.008f, 1.007f, 0.0f)
                curveToRelative(1.632f, -0.065f, 3.218f, -0.435f, 4.715f, -1.096f)
                curveToRelative(2.382f, -1.054f, 4.375f, -3.253f, 5.106f, -5.748f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-3.979f, -3.908f)
                close()
            }
        }
        .build()
        return _scalpel!!
    }

private var _scalpel: ImageVector? = null
