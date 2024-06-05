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

public val Icons.Outline.StarOctogram: ImageVector
    get() {
        if (_starOctogram != null) {
            return _starOctogram!!
        }
        _starOctogram = Builder(name = "StarOctogram", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 256.0f)
                lineToRelative(-74.99f, 74.99f)
                verticalLineToRelative(106.02f)
                horizontalLineTo(330.99f)
                lineTo(256.0f, 512.0f)
                lineToRelative(-74.99f, -74.99f)
                horizontalLineTo(74.99f)
                verticalLineTo(330.99f)
                lineTo(0.0f, 256.0f)
                lineToRelative(74.99f, -74.99f)
                verticalLineTo(74.99f)
                horizontalLineToRelative(106.02f)
                lineTo(256.0f, 0.0f)
                lineToRelative(74.99f, 74.99f)
                horizontalLineToRelative(106.02f)
                verticalLineToRelative(106.02f)
                lineTo(512.0f, 256.0f)
                close()
                moveTo(406.85f, 300.78f)
                lineToRelative(44.8f, -44.8f)
                lineToRelative(-44.8f, -44.8f)
                lineToRelative(-12.5f, -12.48f)
                verticalLineToRelative(-81.07f)
                horizontalLineToRelative(-81.07f)
                lineToRelative(-12.48f, -12.5f)
                lineTo(256.0f, 60.33f)
                verticalLineToRelative(0.02f)
                lineToRelative(-57.3f, 57.3f)
                horizontalLineToRelative(-81.07f)
                verticalLineToRelative(81.07f)
                lineToRelative(-12.5f, 12.48f)
                lineTo(60.33f, 256.0f)
                lineToRelative(44.82f, 44.8f)
                lineToRelative(12.5f, 12.46f)
                verticalLineToRelative(81.07f)
                horizontalLineToRelative(81.07f)
                lineToRelative(12.48f, 12.5f)
                lineToRelative(44.8f, 44.8f)
                lineToRelative(44.8f, -44.8f)
                lineToRelative(12.48f, -12.5f)
                horizontalLineToRelative(81.07f)
                verticalLineToRelative(-81.07f)
                lineTo(406.85f, 300.78f)
                close()
            }
        }
        .build()
        return _starOctogram!!
    }

private var _starOctogram: ImageVector? = null
