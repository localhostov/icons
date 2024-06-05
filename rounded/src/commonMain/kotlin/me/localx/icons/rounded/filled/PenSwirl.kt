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

public val Icons.Filled.PenSwirl: ImageVector
    get() {
        if (_penSwirl != null) {
            return _penSwirl!!
        }
        _penSwirl = Builder(name = "PenSwirl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.27f, 7.48f)
                lineTo(20.077f, 0.673f)
                curveToRelative(0.897f, -0.897f, 2.353f, -0.897f, 3.25f, 0.0f)
                reflectiveCurveToRelative(0.897f, 2.353f, 0.0f, 3.25f)
                lineToRelative(-6.807f, 6.807f)
                curveToRelative(-0.813f, 0.813f, -1.915f, 1.27f, -3.065f, 1.27f)
                horizontalLineToRelative(-1.455f)
                verticalLineToRelative(-1.455f)
                curveToRelative(0.0f, -1.15f, 0.457f, -2.252f, 1.27f, -3.065f)
                close()
                moveTo(8.296f, 22.126f)
                curveToRelative(-4.001f, -2.223f, -6.295f, -5.913f, -6.295f, -10.126f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(0.927f, 0.0f, 1.844f, 0.127f, 2.728f, 0.376f)
                curveToRelative(0.091f, 0.026f, 0.183f, 0.038f, 0.272f, 0.038f)
                curveToRelative(0.436f, 0.0f, 0.837f, -0.287f, 0.962f, -0.728f)
                curveToRelative(0.15f, -0.532f, -0.159f, -1.085f, -0.69f, -1.234f)
                curveToRelative(-1.061f, -0.3f, -2.162f, -0.452f, -3.272f, -0.452f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 4.96f, 2.669f, 9.288f, 7.324f, 11.874f)
                curveToRelative(0.154f, 0.086f, 0.321f, 0.126f, 0.485f, 0.126f)
                curveToRelative(0.352f, 0.0f, 0.692f, -0.186f, 0.875f, -0.515f)
                curveToRelative(0.269f, -0.482f, 0.094f, -1.091f, -0.388f, -1.359f)
                close()
                moveTo(22.315f, 8.038f)
                curveToRelative(-0.531f, 0.149f, -0.84f, 0.702f, -0.69f, 1.233f)
                curveToRelative(0.25f, 0.885f, 0.376f, 1.803f, 0.376f, 2.729f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -1.11f, -0.152f, -2.211f, -0.452f, -3.271f)
                curveToRelative(-0.149f, -0.532f, -0.702f, -0.844f, -1.234f, -0.69f)
                close()
            }
        }
        .build()
        return _penSwirl!!
    }

private var _penSwirl: ImageVector? = null
