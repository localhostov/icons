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

public val Icons.Bold.Spa: ImageVector
    get() {
        if (_spa != null) {
            return _spa!!
        }
        _spa = Builder(name = "Spa", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.544f, 14.01f)
                arcTo(3.78f, 3.78f, 0.0f, false, false, 22.0f, 11.0f)
                curveToRelative(0.0f, -2.379f, -1.942f, -4.0f, -5.452f, -4.662f)
                arcTo(3.819f, 3.819f, 0.0f, false, false, 17.0f, 4.5f)
                curveTo(17.0f, 1.767f, 14.448f, 0.0f, 10.5f, 0.0f)
                reflectiveCurveTo(4.0f, 1.767f, 4.0f, 4.5f)
                arcTo(3.79f, 3.79f, 0.0f, false, false, 5.264f, 7.365f)
                arcTo(4.008f, 4.008f, 0.0f, false, false, 3.0f, 11.0f)
                arcToRelative(3.841f, 3.841f, 0.0f, false, false, 1.132f, 2.783f)
                curveTo(1.8f, 14.5f, 0.0f, 15.863f, 0.0f, 18.5f)
                curveTo(0.0f, 24.0f, 7.806f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(12.0f, 0.0f, 12.0f, -5.5f)
                curveTo(24.0f, 16.123f, 22.539f, 14.776f, 20.544f, 14.01f)
                close()
                moveTo(19.0f, 11.0f)
                curveToRelative(0.0f, 0.97f, -2.278f, 2.0f, -6.5f, 2.0f)
                curveTo(8.551f, 13.0f, 6.0f, 12.215f, 6.0f, 11.0f)
                reflectiveCurveToRelative(2.551f, -2.0f, 6.5f, -2.0f)
                curveTo(16.722f, 9.0f, 19.0f, 10.03f, 19.0f, 11.0f)
                close()
                moveTo(10.5f, 3.0f)
                curveToRelative(1.686f, 0.0f, 3.5f, 0.469f, 3.5f, 1.5f)
                reflectiveCurveTo(12.186f, 6.0f, 10.5f, 6.0f)
                reflectiveCurveTo(7.0f, 5.531f, 7.0f, 4.5f)
                reflectiveCurveTo(8.814f, 3.0f, 10.5f, 3.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-6.224f, 0.0f, -9.0f, -0.771f, -9.0f, -2.5f)
                reflectiveCurveTo(5.776f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveToRelative(9.0f, 0.771f, 9.0f, 2.5f)
                reflectiveCurveTo(18.225f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _spa!!
    }

private var _spa: ImageVector? = null
