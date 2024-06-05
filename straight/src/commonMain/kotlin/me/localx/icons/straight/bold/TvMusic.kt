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

public val Icons.Bold.TvMusic: ImageVector
    get() {
        if (_tvMusic != null) {
            return _tvMusic!!
        }
        _tvMusic = Builder(name = "TvMusic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 23.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 4.5f)
                curveTo(0.0f, 2.57f, 1.57f, 1.0f, 3.5f, 1.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(3.0f)
                lineTo(3.5f, 4.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                lineTo(3.0f, 15.0f)
                lineTo(21.0f, 15.0f)
                lineTo(21.0f, 4.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.5f)
                lineTo(18.0f, 1.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(13.5f)
                lineTo(13.5f, 18.0f)
                close()
                moveTo(8.0f, 9.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                lineTo(14.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 1.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _tvMusic!!
    }

private var _tvMusic: ImageVector? = null
