package me.localx.icons.straight.outline

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
                moveToRelative(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.005f)
                curveToRelative(0.586f, -0.432f, 1.272f, -0.733f, 2.0f, -0.877f)
                verticalLineToRelative(-1.542f)
                lineTo(12.414f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(13.0f, 3.414f)
                lineToRelative(3.586f, 3.586f)
                horizontalLineToRelative(-3.586f)
                verticalLineToRelative(-3.586f)
                close()
                moveTo(23.122f, 11.879f)
                curveToRelative(-1.134f, -1.134f, -3.11f, -1.134f, -4.243f, 0.0f)
                lineToRelative(-7.879f, 7.878f)
                verticalLineToRelative(4.243f)
                horizontalLineToRelative(4.243f)
                lineToRelative(7.878f, -7.878f)
                curveToRelative(0.567f, -0.567f, 0.879f, -1.32f, 0.879f, -2.122f)
                reflectiveCurveToRelative(-0.312f, -1.555f, -0.878f, -2.121f)
                close()
                moveTo(21.707f, 14.707f)
                lineToRelative(-7.292f, 7.293f)
                horizontalLineToRelative(-1.415f)
                verticalLineToRelative(-1.415f)
                lineToRelative(7.293f, -7.292f)
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
