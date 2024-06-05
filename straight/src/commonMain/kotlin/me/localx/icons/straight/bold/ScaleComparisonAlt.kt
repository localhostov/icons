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

public val Icons.Bold.ScaleComparisonAlt: ImageVector
    get() {
        if (_scaleComparisonAlt != null) {
            return _scaleComparisonAlt!!
        }
        _scaleComparisonAlt = Builder(name = "ScaleComparisonAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 14.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 2.485f, -2.014f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.015f, -4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(8.972f, 12.0f)
                horizontalLineToRelative(0.028f)
                verticalLineToRelative(-1.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 2.485f, 2.014f, 4.5f, 4.5f, 4.5f)
                curveToRelative(2.316f, 0.0f, 4.223f, -1.75f, 4.472f, -4.0f)
                close()
                moveTo(13.5f, 5.733f)
                lineToRelative(6.808f, 1.539f)
                lineToRelative(0.662f, -2.926f)
                lineToRelative(-7.47f, -1.689f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.978f)
                lineTo(3.617f, 0.422f)
                lineToRelative(-0.662f, 2.926f)
                lineToRelative(7.545f, 1.706f)
                verticalLineToRelative(15.946f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.5f)
                lineTo(13.5f, 5.732f)
                close()
                moveTo(3.207f, 10.207f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(18.039f, 9.461f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.625f, 2.625f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.586f, 2.586f)
                lineToRelative(-1.211f, -1.211f)
                close()
            }
        }
        .build()
        return _scaleComparisonAlt!!
    }

private var _scaleComparisonAlt: ImageVector? = null
