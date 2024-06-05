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

public val Icons.Outline.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(15.254f, 7.332f)
                arcToRelative(9.927f, 9.927f, 0.0f, false, true, -2.2f, -5.275f)
                arcToRelative(9.951f, 9.951f, 0.0f, false, true, 5.266f, 2.2f)
                close()
                moveTo(13.836f, 8.75f)
                lineTo(12.0f, 10.586f)
                lineTo(5.676f, 4.262f)
                arcToRelative(9.956f, 9.956f, 0.0f, false, true, 5.377f, -2.214f)
                arcToRelative(11.933f, 11.933f, 0.0f, false, false, 2.783f, 6.702f)
                close()
                moveTo(10.586f, 12.0f)
                lineTo(8.749f, 13.837f)
                arcToRelative(11.921f, 11.921f, 0.0f, false, false, -6.7f, -2.784f)
                arcToRelative(9.956f, 9.956f, 0.0f, false, true, 2.213f, -5.377f)
                close()
                moveTo(7.332f, 15.254f)
                lineTo(4.262f, 18.324f)
                arcToRelative(9.951f, 9.951f, 0.0f, false, true, -2.2f, -5.266f)
                arcToRelative(9.927f, 9.927f, 0.0f, false, true, 5.27f, 2.196f)
                close()
                moveTo(8.746f, 16.668f)
                arcToRelative(9.927f, 9.927f, 0.0f, false, true, 2.2f, 5.275f)
                arcToRelative(9.951f, 9.951f, 0.0f, false, true, -5.266f, -2.205f)
                close()
                moveTo(10.163f, 15.251f)
                lineTo(12.0f, 13.414f)
                lineTo(18.324f, 19.738f)
                arcToRelative(9.948f, 9.948f, 0.0f, false, true, -5.377f, 2.214f)
                arcToRelative(11.921f, 11.921f, 0.0f, false, false, -2.784f, -6.701f)
                close()
                moveTo(13.414f, 12.0f)
                lineTo(15.25f, 10.164f)
                arcToRelative(11.933f, 11.933f, 0.0f, false, false, 6.7f, 2.783f)
                arcToRelative(9.956f, 9.956f, 0.0f, false, true, -2.214f, 5.377f)
                close()
                moveTo(16.668f, 8.746f)
                lineTo(19.738f, 5.676f)
                arcToRelative(9.951f, 9.951f, 0.0f, false, true, 2.205f, 5.266f)
                arcToRelative(9.935f, 9.935f, 0.0f, false, true, -5.275f, -2.196f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
