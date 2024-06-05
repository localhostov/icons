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

public val Icons.Outline.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.4f, 22.0f)
                lineToRelative(-4.134f, -6.0f)
                horizontalLineToRelative(2.819f)
                lineTo(16.8f, 10.0f)
                horizontalLineToRelative(3.155f)
                lineToRelative(-5.9f, -8.929f)
                arcToRelative(2.516f, 2.516f, 0.0f, false, false, -4.117f, 0.02f)
                lineTo(4.044f, 10.0f)
                horizontalLineTo(7.2f)
                lineTo(2.912f, 16.0f)
                horizontalLineTo(5.731f)
                lineTo(1.6f, 22.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(8.16f, 16.0f)
                horizontalLineToRelative(5.251f)
                lineToRelative(-1.378f, -2.0f)
                horizontalLineTo(6.8f)
                lineToRelative(2.858f, -4.0f)
                horizontalLineToRelative(2.228f)
                lineTo(10.456f, 8.0f)
                horizontalLineTo(7.765f)
                lineToRelative(3.824f, -5.785f)
                arcToRelative(0.489f, 0.489f, 0.0f, false, true, 0.808f, -0.02f)
                lineTo(16.235f, 8.0f)
                horizontalLineTo(12.914f)
                lineTo(17.2f, 14.0f)
                horizontalLineTo(14.462f)
                lineTo(18.6f, 20.0f)
                horizontalLineTo(5.4f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
