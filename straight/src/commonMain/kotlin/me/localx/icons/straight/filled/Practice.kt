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

public val Icons.Filled.Practice: ImageVector
    get() {
        if (_practice != null) {
            return _practice!!
        }
        _practice = Builder(name = "Practice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.5f, 12.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(18.479f, 16.0f)
                lineTo(5.521f, 16.0f)
                lineToRelative(-3.201f, -4.573f)
                lineToRelative(-1.639f, 1.146f)
                lineToRelative(3.799f, 5.427f)
                horizontalLineToRelative(3.521f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.521f)
                lineToRelative(3.799f, -5.427f)
                lineToRelative(-1.639f, -1.146f)
                lineToRelative(-3.201f, 4.573f)
                close()
                moveTo(11.0f, 7.846f)
                lineToRelative(2.755f, -2.755f)
                curveToRelative(0.327f, -0.327f, 0.327f, -0.856f, 0.0f, -1.183f)
                lineToRelative(-2.755f, -2.755f)
                verticalLineToRelative(2.347f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.346f)
                close()
                moveTo(22.898f, 5.303f)
                lineToRelative(1.0f, 0.576f)
                lineToRelative(-0.998f, 1.732f)
                lineToRelative(-1.002f, -0.577f)
                curveToRelative(-0.391f, 0.371f, -0.87f, 0.642f, -1.399f, 0.801f)
                verticalLineToRelative(1.163f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.163f)
                curveToRelative(-0.529f, -0.159f, -1.007f, -0.431f, -1.399f, -0.801f)
                lineToRelative(-1.002f, 0.577f)
                lineToRelative(-0.998f, -1.732f)
                lineToRelative(1.0f, -0.576f)
                curveToRelative(-0.061f, -0.259f, -0.102f, -0.526f, -0.102f, -0.803f)
                reflectiveCurveToRelative(0.041f, -0.544f, 0.102f, -0.803f)
                lineToRelative(-1.0f, -0.576f)
                lineToRelative(0.998f, -1.732f)
                lineToRelative(1.002f, 0.577f)
                curveToRelative(0.391f, -0.371f, 0.87f, -0.642f, 1.399f, -0.801f)
                lineTo(18.499f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.163f)
                curveToRelative(0.529f, 0.159f, 1.007f, 0.431f, 1.399f, 0.801f)
                lineToRelative(1.002f, -0.577f)
                lineToRelative(0.998f, 1.732f)
                lineToRelative(-1.0f, 0.576f)
                curveToRelative(0.061f, 0.259f, 0.102f, 0.526f, 0.102f, 0.803f)
                reflectiveCurveToRelative(-0.041f, 0.544f, -0.102f, 0.803f)
                close()
                moveTo(21.0f, 4.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                close()
                moveTo(4.971f, 9.0f)
                verticalLineToRelative(-2.0f)
                lineTo(1.971f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(1.471f, 6.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.0f, -0.5f, 1.5f, -1.541f, 1.5f, -2.5f)
                curveToRelative(0.0f, -1.073f, -0.482f, -2.072f, -1.323f, -2.742f)
                curveTo(4.807f, 0.09f, 3.715f, -0.153f, 2.648f, 0.094f)
                curveTo(1.373f, 0.389f, 0.358f, 1.404f, 0.064f, 2.68f)
                curveToRelative(-0.284f, 1.232f, 0.407f, 2.82f, 1.407f, 3.32f)
                close()
            }
        }
        .build()
        return _practice!!
    }

private var _practice: ImageVector? = null
