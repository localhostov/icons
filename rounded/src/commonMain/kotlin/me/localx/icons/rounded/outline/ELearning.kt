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

public val Icons.Outline.ELearning: ImageVector
    get() {
        if (_eLearning != null) {
            return _eLearning!!
        }
        _eLearning = Builder(name = "ELearning", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9f, 3.091f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 14.9f, 0.153f)
                lineTo(13.176f, 0.646f)
                arcTo(2.981f, 2.981f, 0.0f, false, false, 12.0f, 1.3f)
                arcTo(2.981f, 2.981f, 0.0f, false, false, 10.824f, 0.646f)
                lineTo(9.1f, 0.153f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.105f, 3.091f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 0.0f, 8.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 19.9f, 3.091f)
                close()
                moveTo(13.0f, 3.531f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.725f, -0.961f)
                lineToRelative(1.725f, -0.493f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 4.0f)
                verticalLineTo(7.938f)
                arcToRelative(2.006f, 2.006f, 0.0f, false, true, -1.45f, 1.921f)
                lineTo(13.0f, 10.873f)
                close()
                moveTo(6.8f, 2.4f)
                arcTo(1.993f, 1.993f, 0.0f, false, true, 8.55f, 2.077f)
                lineToRelative(1.725f, 0.493f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 3.531f)
                verticalLineToRelative(7.342f)
                lineTo(7.45f, 9.859f)
                arcTo(2.006f, 2.006f, 0.0f, false, true, 6.0f, 7.938f)
                verticalLineTo(4.0f)
                arcTo(1.987f, 1.987f, 0.0f, false, true, 6.8f, 2.4f)
                close()
                moveTo(22.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.0f, 5.184f)
                verticalLineTo(7.938f)
                arcToRelative(4.014f, 4.014f, 0.0f, false, false, 2.9f, 3.845f)
                lineToRelative(3.451f, 0.987f)
                arcToRelative(6.019f, 6.019f, 0.0f, false, false, 3.3f, 0.0f)
                lineToRelative(3.451f, -0.987f)
                arcTo(4.014f, 4.014f, 0.0f, false, false, 20.0f, 7.938f)
                verticalLineTo(5.184f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 8.0f)
                close()
            }
        }
        .build()
        return _eLearning!!
    }

private var _eLearning: ImageVector? = null
