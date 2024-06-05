package me.localx.icons.rounded.bold

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

public val Icons.Bold.Escalator: ImageVector
    get() {
        if (_escalator != null) {
            return _escalator!!
        }
        _escalator = Builder(name = "Escalator", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(24.0f, 9.5f)
                curveToRelative(0.0f, 2.32f, -1.715f, 4.205f, -3.919f, 4.468f)
                lineToRelative(-10.23f, 8.525f)
                curveToRelative(-1.166f, 0.971f, -2.644f, 1.506f, -4.161f, 1.506f)
                horizontalLineToRelative(-1.189f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                curveToRelative(0.0f, -2.32f, 1.715f, -4.205f, 3.919f, -4.468f)
                lineToRelative(1.081f, -0.901f)
                verticalLineToRelative(-4.631f)
                curveToRelative(0.0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.562f, 0.0f, 2.884f, 1.023f, 3.335f, 2.435f)
                lineToRelative(2.315f, -1.929f)
                curveToRelative(1.165f, -0.972f, 2.644f, -1.507f, 4.161f, -1.507f)
                horizontalLineToRelative(1.189f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(21.0f, 9.548f)
                curveToRelative(0.0f, -0.875f, -0.673f, -1.548f, -1.5f, -1.548f)
                horizontalLineToRelative(-1.189f)
                curveToRelative(-0.817f, 0.0f, -1.613f, 0.288f, -2.24f, 0.812f)
                lineToRelative(-10.61f, 8.841f)
                curveToRelative(-0.27f, 0.225f, -0.609f, 0.348f, -0.96f, 0.348f)
                curveToRelative(-0.85f, 0.0f, -1.5f, 0.651f, -1.5f, 1.452f)
                curveToRelative(0.0f, 0.875f, 0.673f, 1.548f, 1.5f, 1.548f)
                horizontalLineToRelative(1.189f)
                curveToRelative(0.817f, 0.0f, 1.613f, -0.288f, 2.241f, -0.811f)
                lineToRelative(10.609f, -8.841f)
                curveToRelative(0.27f, -0.225f, 0.609f, -0.348f, 0.96f, -0.348f)
                curveToRelative(0.85f, 0.0f, 1.5f, -0.651f, 1.5f, -1.452f)
                close()
            }
        }
        .build()
        return _escalator!!
    }

private var _escalator: ImageVector? = null
