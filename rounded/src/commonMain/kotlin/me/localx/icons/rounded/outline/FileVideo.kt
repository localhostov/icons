package me.localx.icons.rounded.outline

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

public val Icons.Outline.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) {
            return _fileVideo!!
        }
        _fileVideo = Builder(name = "FileVideo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.95f, 5.536f)
                lineToRelative(-3.485f, -3.485f)
                curveToRelative(-1.322f, -1.322f, -3.08f, -2.05f, -4.95f, -2.05f)
                lineTo(7.0f, 0.001f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(22.0f, 10.485f)
                curveToRelative(0.0f, -1.87f, -0.728f, -3.627f, -2.05f, -4.95f)
                close()
                moveTo(18.536f, 6.95f)
                curveToRelative(0.315f, 0.315f, 0.564f, 0.674f, 0.781f, 1.05f)
                horizontalLineToRelative(-4.317f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                lineTo(14.0f, 2.683f)
                curveToRelative(0.376f, 0.217f, 0.735f, 0.466f, 1.05f, 0.781f)
                lineToRelative(3.485f, 3.485f)
                close()
                moveTo(20.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(7.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(0.165f, 0.0f, 0.323f, 0.032f, 0.485f, 0.047f)
                lineTo(12.0f, 7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.953f)
                curveToRelative(0.016f, 0.162f, 0.047f, 0.32f, 0.047f, 0.485f)
                verticalLineToRelative(8.515f)
                close()
                moveTo(16.375f, 13.218f)
                lineToRelative(-1.375f, 1.031f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(7.0f, 11.999f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.25f)
                lineToRelative(1.375f, 1.031f)
                curveToRelative(0.669f, 0.502f, 1.625f, 0.024f, 1.625f, -0.812f)
                verticalLineToRelative(-3.938f)
                curveToRelative(0.0f, -0.837f, -0.955f, -1.314f, -1.625f, -0.812f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
