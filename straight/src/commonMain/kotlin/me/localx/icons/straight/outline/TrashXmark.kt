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

public val Icons.Outline.TrashXmark: ImageVector
    get() {
        if (_trashXmark != null) {
            return _trashXmark!!
        }
        _trashXmark = Builder(name = "TrashXmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.644f)
                lineToRelative(1.703f, 15.331f)
                curveToRelative(0.169f, 1.521f, 1.451f, 2.669f, 2.982f, 2.669f)
                horizontalLineToRelative(9.304f)
                curveToRelative(1.531f, 0.0f, 2.813f, -1.147f, 2.981f, -2.669f)
                lineToRelative(1.703f, -15.331f)
                horizontalLineToRelative(1.682f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(17.626f, 21.11f)
                curveToRelative(-0.056f, 0.507f, -0.483f, 0.89f, -0.994f, 0.89f)
                lineTo(7.329f, 22.0f)
                curveToRelative(-0.51f, 0.0f, -0.938f, -0.383f, -0.994f, -0.89f)
                lineToRelative(-1.679f, -15.11f)
                horizontalLineToRelative(14.65f)
                lineToRelative(-1.679f, 15.11f)
                close()
                moveTo(8.043f, 16.543f)
                lineToRelative(2.543f, -2.543f)
                lineToRelative(-2.543f, -2.543f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.543f, 2.543f)
                lineToRelative(2.543f, -2.543f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.543f, 2.543f)
                lineToRelative(2.543f, 2.543f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.543f, -2.543f)
                lineToRelative(-2.543f, 2.543f)
                lineToRelative(-1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _trashXmark!!
    }

private var _trashXmark: ImageVector? = null
