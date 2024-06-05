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

public val Icons.Outline.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(21.0f, 18.3f)
                lineTo(20.832f, 18.552f)
                arcToRelative(6.188f, 6.188f, 0.0f, false, true, -1.482f, 1.413f)
                lineTo(21.0f, 24.0f)
                lineTo(18.838f, 24.0f)
                lineToRelative(-1.246f, -3.046f)
                arcTo(13.937f, 13.937f, 0.0f, false, true, 12.0f, 22.0f)
                arcToRelative(13.937f, 13.937f, 0.0f, false, true, -5.592f, -1.046f)
                lineTo(5.162f, 24.0f)
                lineTo(3.0f, 24.0f)
                lineToRelative(1.65f, -4.032f)
                arcToRelative(6.188f, 6.188f, 0.0f, false, true, -1.482f, -1.413f)
                lineTo(3.0f, 18.3f)
                lineTo(3.0f, 4.0f)
                arcTo(2.934f, 2.934f, 0.0f, false, true, 4.882f, 1.525f)
                arcTo(20.149f, 20.149f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(20.154f, 20.154f, 0.0f, false, true, 7.118f, 1.525f)
                arcTo(2.935f, 2.935f, 0.0f, false, true, 21.0f, 4.0f)
                close()
                moveTo(5.009f, 4.25f)
                curveTo(5.1f, 8.42f, 7.522f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveToRelative(6.9f, -5.58f, 6.991f, -9.75f)
                arcToRelative(0.979f, 0.979f, 0.0f, false, false, -0.61f, -0.865f)
                arcTo(18.516f, 18.516f, 0.0f, false, false, 12.0f, 2.0f)
                arcTo(18.516f, 18.516f, 0.0f, false, false, 5.619f, 3.385f)
                arcTo(0.979f, 0.979f, 0.0f, false, false, 5.009f, 4.25f)
                close()
                moveTo(19.0f, 11.411f)
                curveTo(17.417f, 14.094f, 14.981f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveToRelative(-5.417f, -1.906f, -7.0f, -4.589f)
                verticalLineToRelative(6.237f)
                curveTo(5.552f, 18.257f, 7.526f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveToRelative(6.438f, -1.735f, 7.0f, -2.353f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
