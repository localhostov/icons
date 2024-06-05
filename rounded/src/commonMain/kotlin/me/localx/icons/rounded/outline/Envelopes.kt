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
                moveTo(19.0f, 1.0f)
                lineTo(9.0f, 1.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                lineTo(4.0f, 14.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.89f, 0.0f, 1.69f, 0.39f, 2.24f, 1.0f)
                lineToRelative(-5.12f, 5.12f)
                curveToRelative(-1.17f, 1.17f, -3.07f, 1.17f, -4.24f, 0.0f)
                lineTo(6.76f, 4.0f)
                curveToRelative(0.55f, -0.62f, 1.35f, -1.0f, 2.24f, -1.0f)
                close()
                moveTo(19.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(6.0f, 6.07f)
                lineToRelative(4.46f, 4.46f)
                curveToRelative(0.97f, 0.97f, 2.26f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.56f, -0.49f, 3.54f, -1.46f)
                lineToRelative(4.46f, -4.46f)
                verticalLineToRelative(7.93f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(19.0f, 22.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 7.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _envelopes!!
    }

private var _envelopes: ImageVector? = null
