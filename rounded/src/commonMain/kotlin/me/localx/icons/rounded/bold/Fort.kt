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

public val Icons.Bold.Fort: ImageVector
    get() {
        if (_fort != null) {
            return _fort!!
        }
        _fort = Builder(name = "Fort", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 0.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.886f, 0.387f, 1.684f, 1.0f, 2.234f)
                verticalLineToRelative(4.766f)
                horizontalLineToRelative(-6.0f)
                lineTo(9.0f, 6.234f)
                curveToRelative(0.613f, -0.55f, 1.0f, -1.347f, 1.0f, -2.234f)
                lineTo(10.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                lineTo(3.0f, 2.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(0.0f, 0.672f, 0.0f, 1.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.886f, 0.387f, 1.684f, 1.0f, 2.234f)
                verticalLineToRelative(12.766f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(23.0f, 6.234f)
                curveToRelative(0.613f, -0.55f, 1.0f, -1.347f, 1.0f, -2.234f)
                lineTo(24.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.0f, 21.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 21.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                lineTo(4.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(18.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _fort!!
    }

private var _fort: ImageVector? = null
