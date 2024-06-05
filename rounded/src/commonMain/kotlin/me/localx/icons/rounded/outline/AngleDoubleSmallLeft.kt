package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.AngleDoubleSmallLeft: ImageVector
    get() {
        if (_angleDoubleSmallLeft != null) {
            return _angleDoubleSmallLeft!!
        }
        _angleDoubleSmallLeft = Builder(name = "AngleDoubleSmallLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.48f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.7f, -0.29f)
                lineTo(5.19f, 14.12f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -4.24f)
                lineTo(9.78f, 5.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.42f)
                lineTo(6.6f, 11.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                lineToRelative(4.59f, 4.58f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.42f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.48f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.48f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.7f, -0.29f)
                lineToRelative(-6.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.42f)
                lineToRelative(6.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.42f)
                lineTo(12.9f, 12.0f)
                lineToRelative(5.29f, 5.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.42f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.48f, 19.0f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallLeft!!
    }

private var _angleDoubleSmallLeft: ImageVector? = null
