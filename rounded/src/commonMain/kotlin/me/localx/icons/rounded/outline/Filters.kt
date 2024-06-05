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

public val Icons.Outline.Filters: ImageVector
    get() {
        if (_filters != null) {
            return _filters!!
        }
        _filters = Builder(name = "Filters", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.172f, 0.0f)
                lineTo(7.828f, 0.0f)
                curveToRelative(-2.11f, 0.0f, -3.828f, 1.717f, -3.828f, 3.829f)
                curveToRelative(0.0f, 1.022f, 0.398f, 1.983f, 1.121f, 2.707f)
                lineToRelative(5.879f, 5.878f)
                verticalLineToRelative(3.586f)
                curveToRelative(0.0f, 0.315f, 0.148f, 0.611f, 0.4f, 0.8f)
                lineToRelative(4.0f, 3.0f)
                curveToRelative(0.176f, 0.132f, 0.388f, 0.2f, 0.6f, 0.2f)
                curveToRelative(0.152f, 0.0f, 0.306f, -0.035f, 0.447f, -0.105f)
                curveToRelative(0.339f, -0.169f, 0.553f, -0.516f, 0.553f, -0.895f)
                verticalLineToRelative(-6.586f)
                lineToRelative(5.879f, -5.879f)
                curveToRelative(0.723f, -0.723f, 1.121f, -1.685f, 1.121f, -2.707f)
                curveToRelative(0.0f, -2.111f, -1.718f, -3.829f, -3.828f, -3.829f)
                close()
                moveTo(21.465f, 5.122f)
                lineToRelative(-6.172f, 6.171f)
                curveToRelative(-0.188f, 0.188f, -0.293f, 0.442f, -0.293f, 0.707f)
                verticalLineToRelative(5.0f)
                lineToRelative(-2.0f, -1.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.265f, -0.105f, -0.52f, -0.293f, -0.707f)
                lineTo(6.535f, 5.122f)
                curveToRelative(-0.345f, -0.346f, -0.535f, -0.805f, -0.535f, -1.293f)
                curveToRelative(0.0f, -1.008f, 0.82f, -1.829f, 1.828f, -1.829f)
                horizontalLineToRelative(12.344f)
                curveToRelative(1.008f, 0.0f, 1.828f, 0.82f, 1.828f, 1.829f)
                curveToRelative(0.0f, 0.488f, -0.19f, 0.948f, -0.535f, 1.293f)
                close()
                moveTo(13.0f, 21.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.379f, -0.214f, 0.725f, -0.553f, 0.895f)
                curveToRelative(-0.142f, 0.071f, -0.295f, 0.105f, -0.447f, 0.105f)
                curveToRelative(-0.212f, 0.0f, -0.424f, -0.068f, -0.6f, -0.2f)
                lineToRelative(-4.0f, -3.0f)
                curveToRelative(-0.252f, -0.188f, -0.4f, -0.485f, -0.4f, -0.8f)
                verticalLineToRelative(-3.586f)
                lineTo(1.121f, 10.536f)
                curveToRelative(-0.723f, -0.724f, -1.121f, -1.685f, -1.121f, -2.707f)
                curveToRelative(0.0f, -1.126f, 0.493f, -2.19f, 1.353f, -2.92f)
                curveToRelative(0.423f, -0.358f, 1.053f, -0.306f, 1.41f, 0.115f)
                curveToRelative(0.357f, 0.421f, 0.306f, 1.052f, -0.115f, 1.41f)
                curveToRelative(-0.411f, 0.349f, -0.647f, 0.858f, -0.647f, 1.396f)
                curveToRelative(0.0f, 0.488f, 0.19f, 0.948f, 0.535f, 1.293f)
                lineToRelative(6.172f, 6.171f)
                curveToRelative(0.188f, 0.188f, 0.293f, 0.442f, 0.293f, 0.707f)
                verticalLineToRelative(3.5f)
                lineToRelative(2.0f, 1.5f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _filters!!
    }

private var _filters: ImageVector? = null
