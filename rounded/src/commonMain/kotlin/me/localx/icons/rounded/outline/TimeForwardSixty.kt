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

public val Icons.Outline.TimeForwardSixty: ImageVector
    get() {
        if (_timeForwardSixty != null) {
            return _timeForwardSixty!!
        }
        _timeForwardSixty = Builder(name = "TimeForwardSixty", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, false, -1.0f, 0.171f)
                lineTo(13.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                arcToRelative(0.985f, 0.985f, 0.0f, false, true, 0.75f, 0.339f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.5f, -1.322f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 18.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 5.544f, 1.589f)
                arcToRelative(3.054f, 3.054f, 0.0f, false, false, 0.121f, -3.009f)
                arcTo(2.942f, 2.942f, 0.0f, false, false, 14.0f, 18.0f)
                close()
                moveTo(14.849f, 21.529f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 14.0f, 20.0f)
                arcToRelative(0.954f, 0.954f, 0.0f, false, true, 0.866f, 0.455f)
                arcTo(1.068f, 1.068f, 0.0f, false, true, 14.849f, 21.529f)
                close()
                moveTo(21.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineTo(24.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 15.0f)
                close()
                moveTo(22.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(20.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(12.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 13.0f)
                close()
                moveTo(24.0f, 3.0f)
                lineTo(24.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(18.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.637f)
                arcTo(9.991f, 9.991f, 0.0f, true, false, 8.364f, 21.318f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.728f, 1.864f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 22.0f, 5.374f)
                lineTo(22.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _timeForwardSixty!!
    }

private var _timeForwardSixty: ImageVector? = null
