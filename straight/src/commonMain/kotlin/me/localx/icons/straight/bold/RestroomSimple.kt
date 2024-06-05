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

public val Icons.Bold.RestroomSimple: ImageVector
    get() {
        if (_restroomSimple != null) {
            return _restroomSimple!!
        }
        _restroomSimple = Builder(name = "RestroomSimple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(21.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.94f)
                lineToRelative(1.432f, -11.948f)
                curveToRelative(0.209f, -1.74f, 1.669f, -3.052f, 3.396f, -3.052f)
                horizontalLineToRelative(0.225f)
                curveToRelative(1.728f, 0.0f, 3.188f, 1.312f, 3.396f, 3.052f)
                lineToRelative(1.432f, 11.948f)
                horizontalLineToRelative(-2.94f)
                close()
                moveTo(17.44f, 18.0f)
                horizontalLineToRelative(3.119f)
                lineToRelative(-1.029f, -8.591f)
                curveToRelative(-0.029f, -0.241f, -0.201f, -0.409f, -0.418f, -0.409f)
                horizontalLineToRelative(-0.225f)
                curveToRelative(-0.217f, 0.0f, -0.389f, 0.168f, -0.418f, 0.409f)
                lineToRelative(-1.029f, 8.591f)
                close()
                moveTo(4.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveTo(5.381f, 0.0f, 4.0f, 0.0f)
                reflectiveCurveTo(1.5f, 1.119f, 1.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.0f, 9.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-6.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(3.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(10.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _restroomSimple!!
    }

private var _restroomSimple: ImageVector? = null
