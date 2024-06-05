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

public val Icons.Outline.PenFancy: ImageVector
    get() {
        if (_penFancy != null) {
            return _penFancy!!
        }
        _penFancy = Builder(name = "PenFancy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.0f)
                curveToRelative(0.0f, -0.801f, -0.313f, -1.555f, -0.879f, -2.122f)
                curveToRelative(-1.17f, -1.169f, -3.072f, -1.169f, -4.242f, 0.0f)
                lineToRelative(-10.133f, 10.133f)
                curveToRelative(-0.049f, 0.008f, -4.102f, 1.277f, -4.102f, 1.277f)
                curveToRelative(-1.438f, 0.452f, -2.546f, 1.645f, -2.891f, 3.113f)
                lineTo(0.026f, 22.772f)
                curveToRelative(-0.079f, 0.337f, 0.021f, 0.69f, 0.267f, 0.935f)
                curveToRelative(0.189f, 0.19f, 0.445f, 0.293f, 0.707f, 0.293f)
                curveToRelative(0.076f, 0.0f, 0.152f, -0.009f, 0.229f, -0.026f)
                lineToRelative(7.37f, -1.728f)
                curveToRelative(1.468f, -0.345f, 2.66f, -1.452f, 3.112f, -2.89f)
                curveToRelative(0.0f, 0.0f, 1.27f, -4.053f, 1.277f, -4.102f)
                lineToRelative(10.133f, -10.132f)
                curveToRelative(0.566f, -0.567f, 0.879f, -1.32f, 0.879f, -2.122f)
                close()
                moveTo(9.803f, 18.756f)
                curveToRelative(-0.241f, 0.768f, -0.878f, 1.358f, -1.661f, 1.542f)
                lineToRelative(-3.953f, 0.927f)
                lineToRelative(2.519f, -2.518f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-2.518f, 2.518f)
                lineToRelative(0.926f, -3.952f)
                curveToRelative(0.184f, -0.784f, 0.775f, -1.42f, 1.543f, -1.662f)
                lineToRelative(2.693f, -0.846f)
                lineToRelative(2.712f, 2.712f)
                lineToRelative(-0.846f, 2.693f)
                close()
                moveTo(21.707f, 3.707f)
                lineToRelative(-10.293f, 10.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(20.293f, 2.293f)
                curveToRelative(0.391f, -0.39f, 1.023f, -0.39f, 1.414f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.189f, 0.189f, 0.293f, 0.44f, 0.293f, 0.707f)
                reflectiveCurveToRelative(-0.104f, 0.518f, -0.293f, 0.707f)
                close()
            }
        }
        .build()
        return _penFancy!!
    }

private var _penFancy: ImageVector? = null
