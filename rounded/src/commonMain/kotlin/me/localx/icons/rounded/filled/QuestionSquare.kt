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

public val Icons.Filled.QuestionSquare: ImageVector
    get() {
        if (_questionSquare != null) {
            return _questionSquare!!
        }
        _questionSquare = Builder(name = "QuestionSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.928f, 12.488f)
                curveToRelative(-0.521f, 0.287f, -0.928f, 0.952f, -0.928f, 1.512f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.284f, 0.807f, -2.626f, 1.963f, -3.264f)
                curveToRelative(0.763f, -0.42f, 1.157f, -1.254f, 1.004f, -2.125f)
                curveToRelative(-0.138f, -0.787f, -0.81f, -1.458f, -1.596f, -1.596f)
                curveToRelative(-0.606f, -0.107f, -1.195f, 0.047f, -1.656f, 0.435f)
                curveToRelative(-0.455f, 0.381f, -0.715f, 0.94f, -0.715f, 1.533f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.185f, 0.521f, -2.302f, 1.429f, -3.064f)
                curveToRelative(0.908f, -0.762f, 2.109f, -1.077f, 3.287f, -0.873f)
                curveToRelative(1.613f, 0.282f, 2.938f, 1.606f, 3.221f, 3.22f)
                curveToRelative(0.298f, 1.699f, -0.509f, 3.395f, -2.009f, 4.222f)
                close()
            }
        }
        .build()
        return _questionSquare!!
    }

private var _questionSquare: ImageVector? = null
