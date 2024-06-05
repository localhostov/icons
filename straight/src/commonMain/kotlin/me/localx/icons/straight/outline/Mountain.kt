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

public val Icons.Outline.Mountain: ImageVector
    get() {
        if (_mountain != null) {
            return _mountain!!
        }
        _mountain = Builder(name = "Mountain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.01f)
                lineTo(0.0f, 22.079f)
                verticalLineToRelative(1.921f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.921f)
                lineTo(12.0f, 0.01f)
                close()
                moveTo(15.701f, 11.004f)
                lineToRelative(-0.78f, 1.487f)
                lineToRelative(-1.894f, -2.854f)
                lineToRelative(-2.575f, 4.066f)
                lineToRelative(-2.05f, -2.894f)
                lineToRelative(3.596f, -6.614f)
                lineToRelative(3.701f, 6.807f)
                close()
                moveTo(2.32f, 22.0f)
                lineToRelative(5.02f, -9.232f)
                lineToRelative(3.207f, 4.528f)
                lineToRelative(2.521f, -3.981f)
                lineToRelative(2.057f, 3.099f)
                lineToRelative(1.727f, -3.294f)
                lineToRelative(4.829f, 8.881f)
                lineTo(2.32f, 22.001f)
                close()
            }
        }
        .build()
        return _mountain!!
    }

private var _mountain: ImageVector? = null
