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

public val Icons.Outline.FileEdit: ImageVector
    get() {
        if (_fileEdit != null) {
            return _fileEdit!!
        }
        _fileEdit = Builder(name = "FileEdit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.813f, 10.0f)
                curveToRelative(0.309f, 0.0f, 0.601f, -0.143f, 0.79f, -0.387f)
                reflectiveCurveToRelative(0.255f, -0.562f, 0.179f, -0.861f)
                curveToRelative(-0.311f, -1.217f, -0.945f, -2.329f, -1.833f, -3.217f)
                lineToRelative(-3.485f, -3.485f)
                curveToRelative(-1.322f, -1.322f, -3.08f, -2.05f, -4.95f, -2.05f)
                horizontalLineToRelative(-4.515f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(0.163f, 0.0f, 0.325f, 0.008f, 0.485f, 0.023f)
                verticalLineToRelative(4.977f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.813f)
                close()
                moveTo(12.0f, 7.0f)
                lineTo(12.0f, 2.659f)
                curveToRelative(0.379f, 0.218f, 0.732f, 0.488f, 1.05f, 0.806f)
                lineToRelative(3.485f, 3.485f)
                curveToRelative(0.314f, 0.314f, 0.583f, 0.668f, 0.803f, 1.05f)
                horizontalLineToRelative(-4.338f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                close()
                moveTo(23.122f, 11.879f)
                curveToRelative(-1.134f, -1.134f, -3.11f, -1.134f, -4.243f, 0.0f)
                lineToRelative(-6.707f, 6.707f)
                curveToRelative(-0.755f, 0.755f, -1.172f, 1.76f, -1.172f, 2.829f)
                verticalLineToRelative(1.586f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.586f)
                curveToRelative(1.069f, 0.0f, 2.073f, -0.417f, 2.828f, -1.172f)
                lineToRelative(6.707f, -6.707f)
                curveToRelative(0.567f, -0.567f, 0.879f, -1.32f, 0.879f, -2.122f)
                reflectiveCurveToRelative(-0.312f, -1.555f, -0.878f, -2.121f)
                close()
                moveTo(21.707f, 14.707f)
                lineToRelative(-6.708f, 6.707f)
                curveToRelative(-0.377f, 0.378f, -0.879f, 0.586f, -1.414f, 0.586f)
                horizontalLineToRelative(-0.586f)
                verticalLineToRelative(-0.586f)
                curveToRelative(0.0f, -0.534f, 0.208f, -1.036f, 0.586f, -1.414f)
                lineToRelative(6.708f, -6.707f)
                curveToRelative(0.377f, -0.378f, 1.036f, -0.378f, 1.414f, 0.0f)
                curveToRelative(0.189f, 0.188f, 0.293f, 0.439f, 0.293f, 0.707f)
                reflectiveCurveToRelative(-0.104f, 0.518f, -0.293f, 0.707f)
                close()
            }
        }
        .build()
        return _fileEdit!!
    }

private var _fileEdit: ImageVector? = null
