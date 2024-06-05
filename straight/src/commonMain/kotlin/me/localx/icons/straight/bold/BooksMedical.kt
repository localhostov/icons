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

public val Icons.Bold.BooksMedical: ImageVector
    get() {
        if (_booksMedical != null) {
            return _booksMedical!!
        }
        _booksMedical = Builder(name = "BooksMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(10.0f, 24.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(3.0f, 24.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(3.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                close()
                moveTo(20.966f, 7.51f)
                lineToRelative(-4.91f, 0.945f)
                lineToRelative(1.631f, 8.186f)
                lineToRelative(4.91f, -0.945f)
                lineToRelative(-1.631f, -8.186f)
                close()
                moveTo(20.399f, 4.564f)
                lineToRelative(-0.567f, -2.946f)
                curveToRelative(-0.209f, -1.085f, -1.257f, -1.795f, -2.342f, -1.586f)
                lineToRelative(-0.982f, 0.189f)
                curveToRelative(-0.763f, 0.147f, -1.34f, 0.709f, -1.543f, 1.408f)
                curveToRelative(-0.174f, -0.927f, -0.987f, -1.628f, -1.965f, -1.628f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.031f)
                lineToRelative(0.489f, 2.54f)
                lineToRelative(4.91f, -0.945f)
                close()
                moveTo(23.164f, 18.642f)
                lineToRelative(-4.91f, 0.945f)
                lineToRelative(0.825f, 4.413f)
                lineToRelative(4.91f, -0.945f)
                lineToRelative(-0.825f, -4.413f)
                close()
                moveTo(5.5f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.5f)
                lineTo(0.0f, 10.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }
        .build()
        return _booksMedical!!
    }

private var _booksMedical: ImageVector? = null
