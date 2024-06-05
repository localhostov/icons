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

public val Icons.Outline.Snowboarding: ImageVector
    get() {
        if (_snowboarding != null) {
            return _snowboarding!!
        }
        _snowboarding = Builder(name = "Snowboarding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.2f, 20.9f)
                arcToRelative(2.014f, 2.014f, 0.0f, false, true, -2.7f, 0.925f)
                lineToRelative(-2.5f, -1.1f)
                verticalLineTo(14.6f)
                lineTo(14.08f, 11.91f)
                lineToRelative(-0.064f, -0.082f)
                lineToRelative(2.16f, -2.948f)
                lineToRelative(6.289f, 4.0f)
                lineTo(23.539f, 11.2f)
                lineTo(12.293f, 4.039f)
                horizontalLineTo(8.416f)
                lineTo(5.709f, 1.332f)
                lineTo(4.3f, 2.746f)
                lineTo(7.588f, 6.039f)
                horizontalLineToRelative(3.227f)
                lineTo(8.623f, 8.89f)
                arcTo(3.022f, 3.022f, 0.0f, false, false, 8.0f, 10.718f)
                verticalLineToRelative(2.7f)
                lineTo(4.555f, 15.144f)
                lineToRelative(0.068f, 0.137f)
                lineToRelative(-1.461f, -0.643f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.974f, -2.656f)
                lineTo(0.374f, 11.141f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 2.339f, 16.46f)
                lineToRelative(16.324f, 7.185f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 21.768f)
                close()
                moveTo(10.0f, 14.657f)
                verticalLineTo(10.718f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.207f, -0.609f)
                lineTo(12.8f, 6.734f)
                lineTo(14.485f, 7.8f)
                lineToRelative(-2.069f, 2.823f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.34f, 2.783f)
                lineTo(15.0f, 15.477f)
                verticalLineToRelative(4.372f)
                lineToRelative(-8.182f, -3.6f)
                close()
                moveTo(15.0f, 2.538f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 2.5f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.0f, 2.538f)
                close()
            }
        }
        .build()
        return _snowboarding!!
    }

private var _snowboarding: ImageVector? = null
