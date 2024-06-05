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

public val Icons.Bold.Monument: ImageVector
    get() {
        if (_monument != null) {
            return _monument!!
        }
        _monument = Builder(name = "Monument", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(1.5f, 24.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                lineTo(22.5f, 21.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(2.0f, 17.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.405f)
                lineToRelative(1.198f, -10.184f)
                curveToRelative(0.117f, -1.0f, 0.575f, -1.944f, 1.287f, -2.656f)
                lineToRelative(2.135f, -2.135f)
                curveToRelative(1.321f, -1.322f, 3.627f, -1.322f, 4.95f, 0.0f)
                lineToRelative(2.135f, 2.135f)
                curveToRelative(0.712f, 0.712f, 1.17f, 1.656f, 1.287f, 2.657f)
                lineToRelative(1.198f, 10.183f)
                horizontalLineToRelative(1.405f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(3.5f, 19.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(16.074f, 16.0f)
                lineToRelative(-1.157f, -9.833f)
                curveToRelative(-0.007f, -0.056f, -0.017f, -0.112f, -0.03f, -0.167f)
                horizontalLineToRelative(-1.388f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.574f)
                close()
                moveTo(7.925f, 16.0f)
                horizontalLineToRelative(2.574f)
                lineTo(10.499f, 6.0f)
                horizontalLineToRelative(-1.388f)
                curveToRelative(-0.013f, 0.055f, -0.023f, 0.11f, -0.03f, 0.167f)
                lineToRelative(-1.157f, 9.833f)
                close()
            }
        }
        .build()
        return _monument!!
    }

private var _monument: ImageVector? = null
