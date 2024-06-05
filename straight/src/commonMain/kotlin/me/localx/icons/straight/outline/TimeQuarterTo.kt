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

public val Icons.Outline.TimeQuarterTo: ImageVector
    get() {
        if (_timeQuarterTo != null) {
            return _timeQuarterTo!!
        }
        _timeQuarterTo = Builder(name = "TimeQuarterTo", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 0.0f, 12.0f)
                curveToRelative(0.0f, -0.367f, 0.017f, -0.731f, 0.049f, -1.09f)
                lineToRelative(1.992f, 0.181f)
                quadTo(2.0f, 11.54f, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 12.0f, 2.0f)
                quadToRelative(-0.46f, 0.0f, -0.909f, 0.041f)
                lineTo(10.91f, 0.049f)
                curveTo(11.269f, 0.017f, 11.633f, 0.0f, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(5.663f, 4.263f)
                lineTo(4.395f, 2.717f)
                arcTo(12.125f, 12.125f, 0.0f, false, false, 2.715f, 4.4f)
                lineTo(4.262f, 5.665f)
                arcTo(10.144f, 10.144f, 0.0f, false, true, 5.663f, 4.263f)
                close()
                moveTo(9.142f, 2.415f)
                lineTo(8.571f, 0.5f)
                arcToRelative(11.984f, 11.984f, 0.0f, false, false, -2.2f, 0.9f)
                lineToRelative(0.939f, 1.766f)
                arcTo(9.951f, 9.951f, 0.0f, false, true, 9.142f, 2.415f)
                close()
                moveTo(3.164f, 7.315f)
                lineTo(1.4f, 6.375f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -0.9f, 2.2f)
                lineToRelative(1.917f, 0.571f)
                arcTo(9.964f, 9.964f, 0.0f, false, true, 3.164f, 7.313f)
                close()
                moveTo(11.0f, 6.0f)
                verticalLineToRelative(4.277f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.723f, 0.723f)
                lineTo(7.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.277f)
                arcTo(1.994f, 1.994f, 0.0f, true, false, 13.0f, 10.277f)
                lineTo(13.0f, 6.0f)
                close()
            }
        }
        .build()
        return _timeQuarterTo!!
    }

private var _timeQuarterTo: ImageVector? = null
