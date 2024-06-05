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

public val Icons.Bold.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.001f, viewportHeight = 512.001f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.134f, 185.472f)
                lineTo(338.966f, 34.304f)
                curveToRelative(-45.855f, -45.737f, -120.076f, -45.737f, -165.931f, 0.0f)
                lineTo(21.867f, 185.472f)
                curveTo(7.819f, 199.445f, -0.055f, 218.457f, 0.0f, 238.272f)
                verticalLineToRelative(221.397f)
                curveTo(0.047f, 488.568f, 23.475f, 511.976f, 52.374f, 512.0f)
                horizontalLineToRelative(407.253f)
                curveToRelative(28.899f, -0.023f, 52.326f, -23.432f, 52.373f, -52.331f)
                verticalLineTo(238.272f)
                curveTo(512.056f, 218.457f, 504.182f, 199.445f, 490.134f, 185.472f)
                close()
                moveTo(448.0f, 448.0f)
                horizontalLineTo(341.334f)
                verticalLineToRelative(-67.883f)
                curveToRelative(0.0f, -44.984f, -36.467f, -81.451f, -81.451f, -81.451f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(-7.765f)
                curveToRelative(-44.984f, 0.0f, -81.451f, 36.467f, -81.451f, 81.451f)
                lineToRelative(0.0f, 0.0f)
                verticalLineTo(448.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(238.272f)
                curveToRelative(0.007f, -2.829f, 1.125f, -5.541f, 3.115f, -7.552f)
                lineTo(218.283f, 79.552f)
                curveToRelative(20.825f, -20.831f, 54.594f, -20.835f, 75.425f, -0.01f)
                curveToRelative(0.003f, 0.003f, 0.007f, 0.007f, 0.01f, 0.01f)
                lineTo(444.886f, 230.72f)
                curveToRelative(1.989f, 2.011f, 3.108f, 4.723f, 3.115f, 7.552f)
                verticalLineTo(448.0f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
