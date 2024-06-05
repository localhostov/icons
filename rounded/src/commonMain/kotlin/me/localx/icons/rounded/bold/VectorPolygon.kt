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

public val Icons.Bold.VectorPolygon: ImageVector
    get() {
        if (_vectorPolygon != null) {
            return _vectorPolygon!!
        }
        _vectorPolygon = Builder(name = "VectorPolygon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.295f, 6.0f)
                horizontalLineToRelative(1.705f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveTo(0.895f, 0.0f, 0.0f, 0.895f, 0.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.705f)
                lineToRelative(-4.295f, -4.867f)
                verticalLineToRelative(-2.266f)
                lineToRelative(4.295f, -4.867f)
                close()
                moveTo(5.732f, 19.0f)
                curveToRelative(-0.176f, -0.303f, -0.428f, -0.556f, -0.732f, -0.732f)
                lineTo(5.0f, 5.732f)
                curveToRelative(0.303f, -0.176f, 0.556f, -0.428f, 0.732f, -0.732f)
                horizontalLineToRelative(11.444f)
                lineToRelative(-3.529f, 4.0f)
                horizontalLineToRelative(-1.647f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.647f)
                lineToRelative(3.529f, 4.0f)
                lineTo(5.732f, 19.0f)
                close()
                moveTo(15.996f, 13.128f)
                reflectiveCurveToRelative(0.0f, -0.001f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(15.996f, 10.872f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.002f, 0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _vectorPolygon!!
    }

private var _vectorPolygon: ImageVector? = null
