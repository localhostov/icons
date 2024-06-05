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

public val Icons.Bold.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) {
            return _fileCloud!!
        }
        _fileCloud = Builder(name = "FileCloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.674f)
                curveToRelative(-1.009f, 0.0f, -1.826f, -0.818f, -1.826f, -1.826f)
                curveToRelative(0.0f, -0.968f, 0.755f, -1.752f, 1.707f, -1.814f)
                curveToRelative(-0.127f, -0.348f, -0.207f, -0.718f, -0.207f, -1.109f)
                curveToRelative(0.0f, -1.795f, 1.455f, -3.25f, 3.25f, -3.25f)
                curveToRelative(1.726f, 0.0f, 3.124f, 1.349f, 3.23f, 3.048f)
                curveToRelative(1.151f, 0.224f, 2.02f, 1.235f, 2.02f, 2.452f)
                close()
                moveTo(22.0f, 5.664f)
                lineTo(22.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.0f)
                curveTo(2.0f, 1.346f, 3.346f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(11.382f)
                lineToRelative(5.618f, 5.664f)
                close()
                moveTo(19.0f, 21.0f)
                lineTo(19.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(14.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                lineTo(5.0f, 21.0f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
