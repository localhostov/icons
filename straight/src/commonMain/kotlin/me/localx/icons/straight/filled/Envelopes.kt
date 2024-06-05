package me.localx.icons.straight.filled

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

public val Icons.Filled.Envelopes: ImageVector
    get() {
        if (_envelopes != null) {
            return _envelopes!!
        }
        _envelopes = Builder(name = "Envelopes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 21.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 23.0f)
                lineTo(0.0f, 7.0f)
                curveToRelative(0.0f, -1.3f, 0.84f, -2.4f, 2.0f, -2.82f)
                lineTo(2.0f, 21.0f)
                lineTo(20.0f, 21.0f)
                close()
                moveTo(11.88f, 9.12f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0.0f)
                lineToRelative(7.11f, -7.11f)
                curveToRelative(-0.55f, -0.62f, -1.34f, -1.01f, -2.23f, -1.01f)
                lineTo(7.0f, 1.0f)
                curveToRelative(-0.89f, 0.0f, -1.68f, 0.4f, -2.23f, 1.01f)
                lineToRelative(7.11f, 7.11f)
                close()
                moveTo(17.54f, 10.53f)
                curveToRelative(-0.97f, 0.97f, -2.26f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineTo(4.0f, 4.07f)
                verticalLineToRelative(14.93f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 4.07f)
                lineToRelative(-6.46f, 6.46f)
                close()
            }
        }
        .build()
        return _envelopes!!
    }

private var _envelopes: ImageVector? = null
