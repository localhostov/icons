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

public val Icons.Bold.FileCircleInfo: ImageVector
    get() {
        if (_fileCircleInfo != null) {
            return _fileCircleInfo!!
        }
        _fileCircleInfo = Builder(name = "FileCircleInfo", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 11.0f)
                curveToRelative(-3.59f, 0.0f, -6.5f, 2.91f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(19.0f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(9.14f, 19.0f)
                curveToRelative(0.19f, 1.09f, 0.59f, 2.1f, 1.16f, 3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                lineTo(12.38f, 0.0f)
                lineToRelative(5.62f, 5.66f)
                verticalLineToRelative(3.36f)
                curveToRelative(-0.17f, 0.0f, -0.33f, -0.03f, -0.5f, -0.03f)
                curveToRelative(-0.87f, 0.0f, -1.71f, 0.13f, -2.5f, 0.38f)
                verticalLineToRelative(-1.38f)
                horizontalLineToRelative(-5.0f)
                lineTo(10.0f, 3.0f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(6.14f)
                close()
            }
        }
        .build()
        return _fileCircleInfo!!
    }

private var _fileCircleInfo: ImageVector? = null
