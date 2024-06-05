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

public val Icons.Filled.Mp4File: ImageVector
    get() {
        if (_mp4File != null) {
            return _mp4File!!
        }
        _mp4File = Builder(name = "Mp4File", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 19.0f)
                horizontalLineToRelative(4.414f)
                lineToRelative(-4.414f, 4.414f)
                verticalLineToRelative(-4.414f)
                close()
                moveTo(12.467f, 6.25f)
                horizontalLineToRelative(-0.715f)
                lineToRelative(0.005f, 1.473f)
                lineToRelative(0.71f, -0.003f)
                curveToRelative(0.413f, 0.0f, 0.762f, -0.336f, 0.762f, -0.735f)
                reflectiveCurveToRelative(-0.349f, -0.735f, -0.762f, -0.735f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(9.31f, 11.069f)
                lineToRelative(-0.385f, -5.31f)
                curveToRelative(-0.032f, -0.535f, -0.358f, -0.759f, -0.749f, -0.759f)
                curveToRelative(-0.26f, 0.0f, -0.501f, 0.184f, -0.638f, 0.486f)
                lineToRelative(-0.883f, 1.942f)
                lineToRelative(-0.883f, -1.942f)
                curveToRelative(-0.137f, -0.302f, -0.378f, -0.486f, -0.638f, -0.486f)
                curveToRelative(-0.391f, 0.0f, -0.717f, 0.224f, -0.749f, 0.759f)
                lineToRelative(-0.385f, 5.31f)
                horizontalLineToRelative(1.217f)
                lineToRelative(0.242f, -3.339f)
                lineToRelative(1.196f, 2.631f)
                lineToRelative(1.196f, -2.631f)
                lineToRelative(0.242f, 3.339f)
                horizontalLineToRelative(1.217f)
                close()
                moveTo(14.478f, 6.985f)
                curveToRelative(0.0f, -1.094f, -0.902f, -1.985f, -2.012f, -1.985f)
                horizontalLineToRelative(-1.967f)
                verticalLineToRelative(6.069f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.096f)
                lineToRelative(0.717f, -0.003f)
                curveToRelative(1.109f, 0.0f, 2.012f, -0.891f, 2.012f, -1.985f)
                close()
                moveTo(19.478f, 5.0f)
                horizontalLineToRelative(-1.253f)
                lineToRelative(-0.004f, 2.723f)
                lineToRelative(-0.969f, -0.002f)
                curveToRelative(-0.277f, 0.0f, -0.501f, -0.221f, -0.499f, -0.499f)
                curveToRelative(0.005f, -0.664f, 0.015f, -1.71f, 0.022f, -2.222f)
                horizontalLineToRelative(-1.276f)
                verticalLineToRelative(2.472f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.499f, 1.499f, 1.5f)
                horizontalLineToRelative(1.23f)
                verticalLineToRelative(2.097f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-6.069f)
                close()
            }
        }
        .build()
        return _mp4File!!
    }

private var _mp4File: ImageVector? = null
