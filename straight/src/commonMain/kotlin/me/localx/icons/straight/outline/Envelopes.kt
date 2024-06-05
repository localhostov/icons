package me.localx.icons.straight.outline

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

public val Icons.Outline.Envelopes: ImageVector
    get() {
        if (_envelopes != null) {
            return _envelopes!!
        }
        _envelopes = Builder(name = "Envelopes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 21.0f)
                lineTo(20.0f, 21.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 23.0f)
                lineTo(0.0f, 7.0f)
                curveToRelative(0.0f, -1.3f, 0.84f, -2.4f, 2.0f, -2.82f)
                lineTo(2.0f, 21.0f)
                close()
                moveTo(24.0f, 4.0f)
                verticalLineToRelative(15.0f)
                lineTo(4.0f, 19.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
                moveTo(6.2f, 3.44f)
                lineToRelative(5.68f, 5.68f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0.0f)
                lineToRelative(5.68f, -5.68f)
                curveToRelative(-0.18f, -0.26f, -0.47f, -0.44f, -0.8f, -0.44f)
                lineTo(7.0f, 3.0f)
                curveToRelative(-0.34f, 0.0f, -0.62f, 0.18f, -0.8f, 0.44f)
                close()
                moveTo(22.0f, 17.0f)
                lineTo(22.0f, 6.07f)
                lineToRelative(-4.46f, 4.46f)
                curveToRelative(-0.97f, 0.97f, -2.26f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineTo(6.0f, 6.07f)
                verticalLineToRelative(10.93f)
                lineTo(22.0f, 17.0f)
                close()
            }
        }
        .build()
        return _envelopes!!
    }

private var _envelopes: ImageVector? = null
