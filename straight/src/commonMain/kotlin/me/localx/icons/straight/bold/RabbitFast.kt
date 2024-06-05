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

public val Icons.Bold.RabbitFast: ImageVector
    get() {
        if (_rabbitFast != null) {
            return _rabbitFast!!
        }
        _rabbitFast = Builder(name = "RabbitFast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.5f)
                curveToRelative(0.0f, -2.589f, -2.416f, -6.32f, -6.225f, -6.493f)
                curveToRelative(-1.152f, -0.393f, -6.218f, -2.007f, -11.775f, -2.007f)
                verticalLineToRelative(3.0f)
                curveToRelative(2.281f, 0.0f, 4.503f, 0.308f, 6.345f, 0.677f)
                curveToRelative(-1.568f, 0.689f, -3.45f, 1.323f, -6.345f, 1.323f)
                verticalLineToRelative(3.0f)
                curveToRelative(2.538f, 0.0f, 4.474f, -0.435f, 6.02f, -0.972f)
                curveToRelative(-0.013f, 0.156f, -0.02f, 0.313f, -0.02f, 0.472f)
                curveToRelative(0.0f, 0.52f, 0.073f, 1.023f, 0.208f, 1.5f)
                horizontalLineToRelative(-4.708f)
                curveToRelative(-1.369f, 0.0f, -2.64f, 0.426f, -3.689f, 1.151f)
                curveToRelative(-0.319f, -0.68f, -1.01f, -1.151f, -1.811f, -1.151f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.941f, 0.65f, 1.729f, 1.525f, 1.943f)
                curveToRelative(-0.337f, 0.785f, -0.525f, 1.65f, -0.525f, 2.557f)
                curveToRelative(0.0f, 3.584f, 2.916f, 6.5f, 6.5f, 6.5f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.266f)
                lineToRelative(3.409f, -8.332f)
                curveToRelative(2.16f, -0.578f, 3.857f, -1.927f, 3.857f, -4.168f)
                close()
                moveTo(21.0f, 8.5f)
                curveToRelative(0.0f, 1.034f, -2.047f, 1.5f, -3.5f, 1.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                curveToRelative(2.137f, 0.0f, 3.5f, 2.298f, 3.5f, 3.5f)
                close()
                moveTo(7.5f, 19.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(6.842f)
                curveToRelative(0.71f, 0.5f, 1.542f, 0.836f, 2.443f, 0.954f)
                lineToRelative(-2.831f, 6.921f)
                curveToRelative(-0.437f, -5.08f, -3.859f, -5.875f, -5.953f, -5.875f)
                verticalLineToRelative(3.0f)
                curveToRelative(1.468f, 0.0f, 2.832f, 0.43f, 2.985f, 3.419f)
                curveToRelative(-0.901f, -0.878f, -2.131f, -1.419f, -3.485f, -1.419f)
                close()
            }
        }
        .build()
        return _rabbitFast!!
    }

private var _rabbitFast: ImageVector? = null
